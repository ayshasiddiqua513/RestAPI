package com.example.springapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Patient;
import com.example.springapp.repository.PatientRepo;

@Service
public class PatientService {
    @Autowired
    PatientRepo patientRepo;
    public Patient addPatients(Patient patient)
    {
        return patientRepo.save(patient);
    }
    public List<Patient> getPatients()
    {
        return patientRepo.findAll();
    }
    public Optional<Patient> getById(int id)
    {
        return patientRepo.findById(id);
    }
    
}