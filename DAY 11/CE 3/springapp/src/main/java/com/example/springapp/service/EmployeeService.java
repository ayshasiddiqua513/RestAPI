package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Employee;
import com.example.springapp.repo.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public Employee addEmployee(Employee employee)
    {
        return employeeRepo.save(employee);
    }
    
    public List<Employee> getEmployees()
    {
        return employeeRepo.findAll();
    }
}
