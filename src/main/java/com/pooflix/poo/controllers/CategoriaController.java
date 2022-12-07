package com.pooflix.poo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pooflix.poo.models.Categoria;
import com.pooflix.poo.repositorie.CategoriaDto;

@Controller
public class CategoriaController {
	
	@Autowired
	private CategoriaDto ca;
	

    @RequestMapping(value="/cadastrarCategoria", method=RequestMethod.GET)
    public String form() {
    	return "addCategoria";
    }
    
    @RequestMapping(value="/cadastrarCategoria", method=RequestMethod.POST)
    public String form(Categoria categoria) {
    	
    	ca.save(categoria);
    	
    	return "redirect:/";
    }
}
