package br.com.locadora.celsius.controllers;

import java.net.URI;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.locadora.celsius.models.Cliente;
import br.com.locadora.celsius.services.ClienteService;

@RestController
@RequestMapping(name = "/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@PostMapping
	public ResponseEntity<Cliente> save(@RequestBody Cliente cliente, HttpServletResponse response) {
		cliente = clienteService.save(cliente);
		
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequestUri()
				.path("/{codigo}")
				.buildAndExpand(cliente.getId())
				.toUri();
		
		response.setHeader("Location", uri.toASCIIString());
		
		return ResponseEntity.created(uri).body(cliente);
	}
}
