package com.example.springapp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="passport")
public class PassPort {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String passPortNumber;
    
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name= "person_id",referencedColumnName = "id")
    @JsonBackReference
    Person person;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getPassPortNumber() {
        return passPortNumber;
    }

    public void setPassPortNumber(String passPortNumber) {
        this.passPortNumber = passPortNumber;
    }
}
