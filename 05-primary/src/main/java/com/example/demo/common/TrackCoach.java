package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "Practice track";
    }
}
