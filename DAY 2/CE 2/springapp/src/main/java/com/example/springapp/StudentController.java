package com.example.springapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
    @GetMapping("/student2")
    public Student getMethodName() {
        Student s2=new Student("ABC", 18);
        return s2;
    }    
}