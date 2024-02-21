package com.example.project_wf.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Pet")
public class Pet {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long petId;
    private String petName;
    private String petType;
    private String breed;
    private String gender;
    private Integer age;
    private String location;
    private Double adoptionFee;

    // Getters and setters
    public Long getPetId() {
        return petId;
    }
    public void setPetId(Long petId) {
        this.petId = petId;
    }
    public String getPetName() {
        return petName;
    }
    public void setPetName(String petName) {
        this.petName = petName;
    }
    public String getPetType() {
        return petType;
    }
    public void setPetType(String petType) {
        this.petType = petType;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Double getAdoptionFee() {
        return adoptionFee;
    }
    public void setAdoptionFee(Double adoptionFee) {
        this.adoptionFee = adoptionFee;
    }
}

