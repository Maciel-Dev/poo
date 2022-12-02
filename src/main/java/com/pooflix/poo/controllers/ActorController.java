package com.pooflix.poo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pooflix.poo.models.Actor;
import com.pooflix.poo.repositorie.ActorDto;

@RestController
public class ActorController {
	
	@Autowired
	private ActorDto ac;
	
	@GetMapping("/actor")
	public Iterable<Actor> getAllActors(){
		return ac.findAll();
	}

    @RequestMapping(value="/cadastrarAtor", method=RequestMethod.GET)
    public String form() {
    	
    	return "addActor";
    }
    
    @RequestMapping(value="/cadastrarAtor", method=RequestMethod.POST)
    public String form(Actor ator) {
    	
    	System.out.println(ator.getNome());
    	System.out.println(ator.getNacionalidade());
    	
    	ac.save(ator);
    	
    	return "redirect:/";
    }
    
    @RequestMapping(value="/", method=RequestMethod.POST)
    public String index() {
    	return "redirect:/";
    }
}
