package com.example.springapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.model.Person;

public interface PersonRepo extends JpaRepository<Person,Long>{
    
}
