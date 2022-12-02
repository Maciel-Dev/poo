package com.pooflix.poo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pooflix.poo.models.Episodio;
import com.pooflix.poo.repositorie.EpisodioDto;

@Controller
public class EpisodioController {
	
	@Autowired
	private EpisodioDto ep;

    @RequestMapping(value="/cadastrarEpisodio", method=RequestMethod.GET)
    public String form() {
    	return "addEpisodio";
    }
    
    @RequestMapping(value="/cadastrarEpisodio", method=RequestMethod.POST)
    public String form(Episodio episodio) {
    	
    	System.out.println(episodio.getResumo());
    	System.out.println(episodio.getTemporada());
    	
    	ep.save(episodio);
    	return "redirect:/";
    }
    
}
