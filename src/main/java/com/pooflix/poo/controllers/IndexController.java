package com.pooflix.poo.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pooflix.poo.models.Actor;
import com.pooflix.poo.repositorie.ActorDto;
import com.pooflix.poo.repositorie.PersonagemDto;

@Controller
public class IndexController {

	@Autowired
	private ActorDto ac;
	
	@Autowired
	private PersonagemDto ps;
	
	
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Actor> act = (List<Actor>) ac.findAll();
		model.addAttribute("listempt", act);
		System.out.prin
		return "index";
	}	
	
}

	

