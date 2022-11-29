package com.pooflix.poo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pooflix.poo.models.Actor;

@Controller
public class ActorController {

    @GetMapping("/addActor")
    public String sendForm(Actor actor) {

        return "addActor";
        
    }

    @PostMapping("/addActor")
    public String processForm(@ModelAttribute Actor actor) {

        return "showMessage";
    }
}
