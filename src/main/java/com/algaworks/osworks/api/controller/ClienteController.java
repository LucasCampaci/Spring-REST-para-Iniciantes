package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {

	
	@GetMapping("/clientes")
	public List<Cliente> teste() {
		var cliente1 = new Cliente();
		cliente1.setId(3l);
		cliente1.setNome("João");
		cliente1.setTelefone("99999999");
		cliente1.setEmail("joao@email.com");
		
		var cliente2 = new Cliente();	
		cliente2.setId(2l);
		cliente2.setNome("Maria");
		cliente2.setTelefone("88888888");
		cliente2.setEmail("maria@email.com");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
