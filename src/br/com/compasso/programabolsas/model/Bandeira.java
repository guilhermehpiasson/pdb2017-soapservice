package br.com.compasso.programabolsas.model;

public class Bandeira {
	
	private Long id = 0l;
	private String nome;
	
	
	public Bandeira(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
