package com.pooflix.poo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pooflix.poo.models.Performance;
import com.pooflix.poo.repositorie.PerformanceDto;

@Controller
public class PerformanceController {
	
	@Autowired
	private PerformanceDto pf;
	

    @RequestMapping(value="/cadastrarPerformance", method=RequestMethod.GET)
    public String form() {
    	return "addPerformance";
    }
    
    @RequestMapping(value="/cadastrarPerformance", method=RequestMethod.POST)
    public String form(Performance performance) {
    	
    	
    	pf.save(performance);
    	
    	return "redirect:/";
    }
    
}
