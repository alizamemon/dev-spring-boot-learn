package com.example.myapp.common;


import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Spend 1 hour in Tennis practice";
    }
}
