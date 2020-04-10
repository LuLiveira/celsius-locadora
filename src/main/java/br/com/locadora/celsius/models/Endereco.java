package br.com.locadora.celsius.models;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class Endereco {

	@NotNull @NotEmpty
	@Size(min = 3, max = 100)
	private String logradouro;
	@NotNull @NotEmpty
	@Size(min = 3, max = 100)
	private String cidade;
	@NotNull @NotEmpty
	@Size(min = 3, max = 100)
	private String bairro;
	@NotNull @NotEmpty
	@Size(min = 3, max = 100)
	private String estado;
	@NotNull @NotEmpty
	@Size(min = 2, max = 2)
	private String uf;
	private String numero;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
