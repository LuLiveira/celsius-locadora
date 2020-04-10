package br.com.locadora.celsius.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.locadora.celsius.models.Cliente;
import br.com.locadora.celsius.models.DVD;
import br.com.locadora.celsius.repositories.ClienteRepository;
import br.com.locadora.celsius.repositories.DVDRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private DVDRepository dvdRepository;
	
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	public void teste() {
		Cliente cliente = clienteRepository.findById(1l).get();
		DVD dvd = dvdRepository.findById(1l).get();
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(cliente);
		dvd.setCliente(clientes);
		
		dvdRepository.save(dvd);
	}
	
}
