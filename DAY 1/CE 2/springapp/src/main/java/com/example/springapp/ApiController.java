package com.example.springapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApiController {
    @GetMapping("/studentName")
    public String f1(@RequestParam String studentName) {
        return "Welcome " + studentName + "!";
    }
}