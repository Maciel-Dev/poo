package com.pooflix.poo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Serie")
public class Serie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "titulo")
    private String titulo;
	
	@Column(name = "classeEtaria")
    private int classetaria;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getClassetaria() {
		return classetaria;
	}

	public void setClassetaria(int classetaria) {
		this.classetaria = classetaria;
	}
	
	
    

	
}
