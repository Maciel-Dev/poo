package com.pooflix.poo.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pooflix.poo.models.Actor;
import com.pooflix.poo.models.Categoria;
import com.pooflix.poo.models.Episodio;
import com.pooflix.poo.models.Performance;
import com.pooflix.poo.models.Personagem;
import com.pooflix.poo.models.Serie;
import com.pooflix.poo.repositorie.ActorDto;
import com.pooflix.poo.repositorie.CategoriaDto;
import com.pooflix.poo.repositorie.EpisodioDto;
import com.pooflix.poo.repositorie.PerformanceDto;
import com.pooflix.poo.repositorie.PersonagemDto;
import com.pooflix.poo.repositorie.SerieDto;

@Controller
public class IndexController {

	@Autowired
	private ActorDto ac;
	
	@Autowired
	private PersonagemDto ps;
	
	@Autowired
	private EpisodioDto ep;
	
	@Autowired
	private SerieDto se;
	
	@Autowired
	private CategoriaDto ca;
	
	@Autowired
	private PerformanceDto pe;
	
	@RequestMapping(value = "/deleteSerie", method = RequestMethod.GET)
	public String handleDeleteSerie(@RequestParam(name="serieId")String serieId, Model model) {
		
		Serie serieFind = se.findById(Integer.parseInt(serieId)).get();
		se.delete(serieFind);
	    
	    return "redirect:/";
	}
	
	@RequestMapping(value = "/deleteActor", method = RequestMethod.GET)
	public String handleDeleteActor(@RequestParam(name="actorId")String actorId, Model model) {
		
		Actor actorFind = ac.findById(Integer.parseInt(actorId)).get();
		ac.delete(actorFind);
	    
	    return "redirect:/";
	}
	
	@RequestMapping(value = "/deletePerformance", method = RequestMethod.GET)
	public String handleDeletePerformance(@RequestParam(name="performanceId")String performanceId, Model model) {
		
		Performance performanceFind = pe.findById(Integer.parseInt(performanceId)).get();
		pe.delete(performanceFind);
	    
	    return "redirect:/";
	}
	
	@RequestMapping(value = "/deletePersonagem", method = RequestMethod.GET)
	public String handleDeletePersonagem(@RequestParam(name="personagemId")String personagemId, Model model) {
		
		Personagem personagemFind = ps.findById(Integer.parseInt(personagemId)).get();
		ps.delete(personagemFind);
	    
	    return "redirect:/";
	}
	
	@RequestMapping(value = "/deleteEpisodio", method = RequestMethod.GET)
	public String handleDeleteEpisodio(@RequestParam(name="episodioId")String episodioId, Model model) {
		
		Episodio episodioFind = ep.findById(Integer.parseInt(episodioId)).get();
		ep.delete(episodioFind);
	    
	    return "redirect:/";
	}
	
	@RequestMapping(value = "/deleteCategoria", method = RequestMethod.GET)
	public String handleDeleteCategoria(@RequestParam(name="categoriaId")String categoriaId, Model model) {
		
		Categoria categoriaFind = ca.findById(Integer.parseInt(categoriaId)).get();
		ca.delete(categoriaFind);
	    
	    return "redirect:/";
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		
		List<Actor> act = (List<Actor>) ac.findAll();
		model.addAttribute("actors", act);
		
		List<Personagem> persona = (List<Personagem>) ps.findAll();
		model.addAttribute("personagens", persona);
		
		List<Episodio> episodio = (List<Episodio>) ep.findAll();
		model.addAttribute("episodios", episodio);
		
		List<Serie> serie = (List<Serie>) se.findAll();
		model.addAttribute("series", serie);
		
		List<Categoria> categoria = (List<Categoria>) ca.findAll();
		model.addAttribute("categorias", categoria);
		
		
		return "index";
	}	
	
}

	

