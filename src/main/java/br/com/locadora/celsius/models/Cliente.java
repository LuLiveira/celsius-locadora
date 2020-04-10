package br.com.locadora.celsius.models;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotEmpty
	@NotNull
	@Size(min = 3, max = 100)
	private String nome;
	@Size(min = 3, max = 100)
	private String sobrenome;
	@Min(value = 18, message = "Idade minima deve ser 18 anos")
	@Max(value = 120, message = "Idade máxima deve ser 100 anos")
	private Integer idade;
	@Size(min = 14, max = 14)
	private String cpf;
	@Size(min = 12, max = 12)
	private String rg;

	@Embedded
	private Endereco endereco;
	
	@ManyToMany(mappedBy = "clientes")
	private List<DVD> dvds;
	
	public Cliente() {}

	public Cliente(String nome, String sobrenome, Integer idade, String cpf, String rg, Endereco endereco) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<DVD> getDvd() {
		return dvds;
	}

	public void setDvd(List<DVD> dvds) {
		this.dvds = dvds;
	}

}
