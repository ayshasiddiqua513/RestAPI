package com.example.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.service.AuthorService;
import com.example.springapp.model.Author;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @PostMapping("/add")
    public Author addAuthor(@RequestBody Author author) {
        
        return authorService.addAuthor(author);
    }

    @GetMapping("/get")
    public List<Author> getMethodName() {
        return authorService.getAuthor();
    }  
    
}
