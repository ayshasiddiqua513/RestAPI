package com.example.project_wf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.project_wf.model.Vet;

@Repository
public interface VetRepo extends JpaRepository<Vet, Long> {

}