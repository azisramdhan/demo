package com.example.demo.rest;

import com.example.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define the private field for the dependency
    @Autowired
    private Coach coach;

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkOut();
    }
}
