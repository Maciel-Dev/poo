package com.pooflix.poo.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Personagem")
public class Personagem {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nome")
	private String nome;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "episodio_id", referencedColumnName = "id")
    private Episodio episodio;
	
	public Episodio getEpisodio() {
		return episodio;
	}

	public void setEpisodio(Episodio episodio) {
		this.episodio = episodio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
