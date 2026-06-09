package com.example.myapp.common;


import org.springframework.stereotype.Component;
import org.springframework.context.annotation.*;

@Component
@Primary
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Spend time in track to familiarize yourself";
    }

}
