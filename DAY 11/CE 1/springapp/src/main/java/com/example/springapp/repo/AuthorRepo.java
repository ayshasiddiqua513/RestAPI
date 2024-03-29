package com.example.springapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.model.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author,Long> {
    
}
