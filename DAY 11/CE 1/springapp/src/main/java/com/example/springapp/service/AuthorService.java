package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Author;
import com.example.springapp.repo.AuthorRepo;

@Service
public class AuthorService {
    @Autowired
    AuthorRepo authorRepo;

    public Author addAuthor(Author author)
    {
        return authorRepo.save(author);

    }
    public List<Author> getAuthor()
    {
        return authorRepo.findAll();
    }
}
