package com.pooflix.poo.models;

import java.util.LinkedList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Personagem")
public class Personagem {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
    private LinkedList<Performance> perfomances;

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

	public LinkedList<Performance> getPerfomances() {
		return perfomances;
	}

	public void setPerfomances(LinkedList<Performance> perfomances) {
		this.perfomances = perfomances;
	}

	
}
