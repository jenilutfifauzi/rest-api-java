package com.morningdev.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    // enpoint to return a welcome message
    @GetMapping
    public String welcome(){
        return "Welcome to springframework";
    }

    // endpoint to test the post request
    @PostMapping
    public String other(){
        return "Data Lain";
    }
}
