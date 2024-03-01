package com.example.springapp.repository;
import com.example.springapp.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<Job,Integer>{
    
}
