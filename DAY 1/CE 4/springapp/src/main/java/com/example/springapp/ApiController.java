package com.example.springapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApiController {
    @GetMapping("/address")
    public Address f1() {
        Address ob = new Address("abc", 123, "Main St", 1, "xy", "cbe", "tn", "india");
        return ob;
    }

}