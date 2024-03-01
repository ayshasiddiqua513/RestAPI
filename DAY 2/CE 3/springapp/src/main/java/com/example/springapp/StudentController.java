package com.example.springapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
    @GetMapping("/student3")
    public Student s1() {
        Student student=new Student(1,"ABC","ABC id is 1");
        return student;
    }
}