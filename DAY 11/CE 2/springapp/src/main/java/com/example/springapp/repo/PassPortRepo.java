package com.example.springapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.model.PassPort;

public interface PassPortRepo extends JpaRepository<PassPort,Long> {
    
}
