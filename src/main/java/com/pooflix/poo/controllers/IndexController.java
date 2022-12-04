package com.pooflix.poo.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pooflix.poo.models.Actor;
import com.pooflix.poo.models.Episodio;
import com.pooflix.poo.models.Personagem;
import com.pooflix.poo.repositorie.ActorDto;
import com.pooflix.poo.repositorie.EpisodioDto;
import com.pooflix.poo.repositorie.PersonagemDto;

@Controller
public class IndexController {

	@Autowired
	private ActorDto ac;
	
	@Autowired
	private PersonagemDto ps;
	
	@Autowired
	private EpisodioDto ep;
	
	
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Actor> act = (List<Actor>) ac.findAll();
		model.addAttribute("actors", act);
		
		List<Personagem> persona = (List<Personagem>) ps.findAll();
		model.addAttribute("personagens", persona);
		
		List<Episodio> episodio = (List<Episodio>) ep.findAll();
		model.addAttribute("episodios", episodio);
		return "index";
	}	
	
}

	

