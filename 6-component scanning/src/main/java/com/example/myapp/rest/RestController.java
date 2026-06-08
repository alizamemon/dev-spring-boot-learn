package com.example.myapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Value;
@org.springframework.web.bind.annotation.RestController



public class RestController {

    //defining a private field for dependency

    //class variable
    private Coach myCoach;

    //optional here because of one constructor
    @Autowired
    public RestController(Coach theCoach) {
        //theCoach constructor parameter
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }


//    @GetMapping("/")
//    public String Hello(){
//        return "Hello World!";
//    }
//
//    @GetMapping("/workout")
//    public String getDailyWorkout(){
//        return "Run a hard 5k!!";
//    }
//
//    @GetMapping("/fortune")
//    public String getDailyFortune(){
//        return "Today is my lucky day.";
//    }
//
//    //injection properties
//    @Value("${coach.name}")
//    private String coachName;
//
//    @Value("${team.name}")
//    private String teamName;
//
//    //expose new endpoint for calling properties
//
//    @GetMapping("/teaminfo")
//    public String getTeamInfo(){
//        return "Coach: " + coachName + ", Team: " + teamName;
//    }
//
//
//
}
