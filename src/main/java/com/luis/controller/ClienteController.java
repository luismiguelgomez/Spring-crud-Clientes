package com.luis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.dto.Cliente;
import com.luis.service.ClienteServiceImpl;

@RestController
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired
	ClienteServiceImpl clienteServiceImpl;
	
	@GetMapping("/clientes")
	public List<Cliente> listarClientes() {
		return clienteServiceImpl.listarClientes();
	}
	
	@PostMapping("/clientes")
	public Cliente guardarClientes(@RequestBody Cliente cliente) {
		return clienteServiceImpl.guardarCliente(cliente);
	}
	
	@GetMapping("/clientes/{id}")
	public Cliente listarClienteXID(@PathVariable(name = "id") Long id) {
		Cliente cliente_xId = new Cliente();
		cliente_xId = clienteServiceImpl.clienteXID(id);
		return cliente_xId;
	}
	
	@PutMapping("/clientes/{id}")
	public Cliente actualizarCliente(@PathVariable(name="id") Long id,@RequestBody Cliente cliente) {
		Cliente cliente_seleccionado = new Cliente();
		Cliente cliente_actualizado = new Cliente();
		
		cliente_seleccionado = clienteServiceImpl.clienteXID(id);
		cliente_seleccionado.setNombre(cliente.getNombre());
		cliente_seleccionado.setApellido(cliente.getApellido());
		cliente_seleccionado.setDireccion(cliente.getDireccion());
		cliente_seleccionado.setDni(cliente.getDni());
		cliente_seleccionado.setFecha(cliente.getFecha());
		
		cliente_actualizado = clienteServiceImpl.actualizarCliente(cliente_seleccionado);
		return cliente_actualizado;
	}
	
	@DeleteMapping("/clientes/{id}")
	public void eliminarCliente(@PathVariable(name = "id") Long id) {
		clienteServiceImpl.eliminarCliente(id);
	}
	
}
