package com.pooflix.poo.models;

import java.util.LinkedList;

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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name = "temporada")
    private String temporada;
	
	@Column(name = "titulo")
    private String titulo;
	
	
	@Column(name = "Resumo")
    public String resumo;
	
	
    private LinkedList<Performance> perfomances;


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


	public LinkedList<Performance> getPerfomances() {
		return perfomances;
	}


	public void setPerfomances(LinkedList<Performance> perfomances) {
		this.perfomances = perfomances;
	}

    
}
