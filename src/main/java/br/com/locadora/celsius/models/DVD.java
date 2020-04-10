package br.com.locadora.celsius.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "filme")
public class DVD {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String titulo;
	private String descricao;
	private Integer quantidade;
	private String valor;
	private boolean disponivel;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "alugados", joinColumns = { @JoinColumn(name = "filme_id") }, inverseJoinColumns = {
			@JoinColumn(name = "cliente_id") })
	private List<Cliente> clientes;

	public DVD() {
	}

	public DVD(String titulo, String descricao, Integer quantidade, String valor, boolean disponivel) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valor = valor;
		this.disponivel = disponivel;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public List<Cliente> getCliente() {
		return clientes;
	}

	public void setCliente(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}
