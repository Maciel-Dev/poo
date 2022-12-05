package com.pooflix.poo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Performance")
public class Performance {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(targetEntity = Actor.class)
	private List<Actor> actors;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	 
}
