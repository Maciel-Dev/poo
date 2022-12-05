package com.pooflix.poo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pooflix.poo.models.Serie;
import com.pooflix.poo.repositorie.SerieDto;

@Controller
public class SerieController {
	
	@Autowired
	private SerieDto seriedto;
	

    @RequestMapping(value="/cadastrarSerie", method=RequestMethod.GET)
    public String form() {
    	return "addSerie";
    }
    
    @RequestMapping(value="/cadastrarSerie", method=RequestMethod.POST)
    public String form(Serie serie) {
    	
    	
    	seriedto.save(serie);
    	
    	return "redirect:/";
    }
}

