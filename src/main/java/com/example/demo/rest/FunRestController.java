package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/something")
    public  String error() {
        return "Hello Error Again and!";
    }
}
