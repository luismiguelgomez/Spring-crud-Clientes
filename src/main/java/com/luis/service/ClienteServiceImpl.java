package com.luis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luis.dao.IClienteDAO;
import com.luis.dto.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	IClienteDAO iClienteDAO;
	
	@Override
	public List<Cliente> listarClientes() {
		
		return iClienteDAO.findAll();
	}

	@Override
	public Cliente guardarCliente(Cliente cliente) {
		return iClienteDAO.save(cliente);
	}

	@Override
	public Cliente clienteXID(Long id) {
		return iClienteDAO.findById(id).get();
	}

	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		
		return iClienteDAO.save(cliente);
	}

	@Override
	public void eliminarCliente(Long id) {
		iClienteDAO.deleteById(id);
	}

}
