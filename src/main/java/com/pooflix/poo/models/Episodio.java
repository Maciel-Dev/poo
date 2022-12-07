package com.pooflix.poo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Episodio")
public class Episodio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "temporada")
    private String temporada;
	
	@Column(name = "titulo")
    private String titulo;
	
	@Column(name = "resumo")
    public String resumo;
	
	@Column(name = "id_seriado")
	public int id_seriado;
	
	@Column(name = "id_categoria")
	public int id_categoria;
	
	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public int getId_seriado() {
		return id_seriado;
	}

	public void setId_seriado(int id_seriado) {
		this.id_seriado = id_seriado;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTemporada() {
		return temporada;
	}


	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getResumo() {
		return resumo;
	}


	public void setResumo(String resumo) {
		this.resumo = resumo;
	}  
}
