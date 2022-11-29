package com.pooflix.poo.models;

import java.util.HashMap;
import java.util.LinkedList;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	
	
    

	
}
