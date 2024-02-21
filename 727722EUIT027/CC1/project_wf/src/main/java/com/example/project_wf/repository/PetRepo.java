package com.example.project_wf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.project_wf.model.Pet;

@Repository
public interface PetRepo extends JpaRepository<Pet, Long> {
    
}

