package com.example.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController

public class RestController {

    @GetMapping("/")
    public String Hello(){
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is my lucky day.";
    }
}
