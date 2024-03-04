package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.model.StudentDetail;

@Repository
public interface StudentDetailRepository extends JpaRepository<StudentDetail,Long>{

    
}