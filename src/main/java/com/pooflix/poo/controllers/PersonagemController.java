package com.pooflix.poo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pooflix.poo.models.Personagem;
import com.pooflix.poo.repositorie.PersonagemDto;

@Controller
public class PersonagemController {
	
	@Autowired
	private PersonagemDto ac;

    @RequestMapping(value="/cadastrarPersonagem", method=RequestMethod.GET)
    public String form() {
    	return "addPersonagem";
    }
    
    @RequestMapping(value="/cadastrarPersonagem", method=RequestMethod.POST)
    public String form(Personagem personagem) {
    	
    	System.out.println(personagem.getNome());
    	System.out.println(personagem.getId());
    	
    	ac.save(personagem);
    	
    	return "redirect:/";
    }
}
