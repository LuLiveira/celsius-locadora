package br.com.locadora.celsius.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.locadora.celsius.models.Cliente;
import br.com.locadora.celsius.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
}
