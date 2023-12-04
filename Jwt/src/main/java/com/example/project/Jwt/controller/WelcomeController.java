package com.example.project.Jwt.controller;


import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/secured")
    public String secured() {
        return "Secured !";
    }

}
