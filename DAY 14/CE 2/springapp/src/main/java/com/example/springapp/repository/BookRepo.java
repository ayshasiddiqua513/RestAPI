package com.example.springapp.repository;


import com.example.springapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {
}
