package com.example.springapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    
}
