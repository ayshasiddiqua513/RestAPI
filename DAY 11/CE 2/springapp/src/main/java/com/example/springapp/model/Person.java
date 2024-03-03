package com.example.springapp.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="passenger")
public class Person {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    String name;
    @OneToOne(mappedBy = "person",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference
    PassPort passPort;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public PassPort getPassPort() {
        return passPort;
    }
    public void setPassPort(PassPort passPort) {
        this.passPort = passPort;
    }
    
    
}
