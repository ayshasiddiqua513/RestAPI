package com.example.springapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Long>{
    
}
