package com.mc.joke.jokeapp.controllers;

import com.mc.joke.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    @Autowired
    JokeService jokeService;

    @GetMapping("/")
    public String showJoke(Model model){
        model.addAttribute("Joke", jokeService.getJoke());
        return "chuckNorris";

    }
}
