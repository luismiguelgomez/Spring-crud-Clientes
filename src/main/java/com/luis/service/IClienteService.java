package com.luis.service;

import java.util.List;

import com.luis.dto.Cliente;

public interface IClienteService {
	
	public List<Cliente> listarClientes();
	
	public Cliente guardarCliente(Cliente cliente);
	
	public Cliente clienteXID(Long id);
	
	public Cliente actualizarCliente(Cliente cliente);
	
	public void eliminarCliente(Long id);
	
}
