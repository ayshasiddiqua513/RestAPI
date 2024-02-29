package com.example.project_wf.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name = "Vet")
public class Vet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long vetId;
    String vetName;
    String specialization;
    String contactNumber;
    public Long getVetId() {
        return vetId;
    }
    public void setVetId(Long vetId) {
        this.vetId = vetId;
    }
    public String getVetName() {
        return vetName;
    }
    public void setVetName(String vetName) {
        this.vetName = vetName;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
}