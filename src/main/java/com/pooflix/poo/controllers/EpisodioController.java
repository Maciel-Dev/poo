package com.pooflix.poo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pooflix.poo.models.Categoria;
import com.pooflix.poo.models.Episodio;
import com.pooflix.poo.models.Serie;
import com.pooflix.poo.repositorie.CategoriaDto;
import com.pooflix.poo.repositorie.EpisodioDto;
import com.pooflix.poo.repositorie.SerieDto;

@Controller
public class EpisodioController {
	
	@Autowired
	private EpisodioDto ep;
	
	@Autowired
	private SerieDto se;
	
	@Autowired
	private CategoriaDto ca;

    @RequestMapping(value="/cadastrarEpisodio", method=RequestMethod.GET)
    public String form(Model model) {
    	
    	
    	List<Serie> listSerie = (List<Serie>) se.findAll();
    	List<Categoria> listCategoria = (List<Categoria>) ca.findAll();
    	
    	model.addAttribute("episodio", new Episodio());
		model.addAttribute("listSerie", listSerie);
		model.addAttribute("listCategoria", listCategoria);
		
		
		
    	return "addEpisodio";
    }
    
    @RequestMapping(value="/cadastrarEpisodio", method=RequestMethod.POST)
    public String form(Episodio episodio) {
 
    	se.findById(episodio.getId_seriado());    	
    	
    	ep.save(episodio);    	
    	return "redirect:/";
    }
    
}
