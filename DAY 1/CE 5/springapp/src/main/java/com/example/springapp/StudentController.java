package com.example.springapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController

public class StudentController {
    @GetMapping("/student")
     public ArrayList<Student> students() {
        ArrayList<Student> details=new ArrayList<>();
        Student st=new Student("John", "Welcome, John!");
        details.add(st);
        return details;
     }
}