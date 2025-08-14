package com.gym.gymapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Gym App!";
    }

    @GetMapping("/members")
    public String members() {
        return "Here you can see all members.";
    }
}
