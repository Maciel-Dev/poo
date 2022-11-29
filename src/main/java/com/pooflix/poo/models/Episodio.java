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

    
}
