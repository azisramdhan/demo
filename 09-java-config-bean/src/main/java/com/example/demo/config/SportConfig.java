package com.example.demo.config;

import com.example.demo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("swim")
    public SwimCoach swimCoach() {
        return new SwimCoach();
    }

}
