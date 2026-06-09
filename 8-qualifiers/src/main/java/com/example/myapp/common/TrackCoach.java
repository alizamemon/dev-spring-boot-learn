package com.example.myapp.common;


import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Spend time in track to familiarize yourself";
    }

}
