package com.luis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luis.dto.Cliente;

public interface IClienteDAO extends JpaRepository<Cliente, Long> {
	
}
