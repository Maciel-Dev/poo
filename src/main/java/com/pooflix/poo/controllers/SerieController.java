package com.pooflix.poo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pooflix.poo.models.Categoria;
import com.pooflix.poo.models.Serie;
import com.pooflix.poo.repositorie.CategoriaDto;
import com.pooflix.poo.repositorie.SerieDto;

@Controller
public class SerieController {
	
	@Autowired
	private SerieDto seriedto;
	
	@Autowired
	private CategoriaDto ca;
	

    @RequestMapping(value="/cadastrarSerie", method=RequestMethod.GET)
    public String form(Model model) {
    	
    	List<Categoria> listCategoria = (List<Categoria>) ca.findAll();
    	model.addAttribute("serie", new Serie());
    	model.addAttribute("listCategoria", listCategoria);
    	
    	return "addSerie";
    }
    
    @RequestMapping(value="/cadastrarSerie", method=RequestMethod.POST)
    public String form(Serie serie) {
    	
    	
    	seriedto.save(serie);
    	
    	return "redirect:/";
    }
}

