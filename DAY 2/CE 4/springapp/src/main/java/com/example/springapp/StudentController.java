package com.example.springapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController

public class StudentController {
   @GetMapping("/book1")
   public Student b1() {
      Date date1 = new Date();// fetching today's date
      Student book = new Student("Book1", "author1", date1);
      return book;
   }
}