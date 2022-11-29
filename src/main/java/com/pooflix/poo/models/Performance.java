package com.pooflix.poo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Performance")
public class Performance {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;


    
}
