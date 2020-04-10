package br.com.locadora.celsius.models;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Endereco {

	private String logradouro;
	private String cidade;
	private String bairro;
	private String estado;
	private String uf;
}
