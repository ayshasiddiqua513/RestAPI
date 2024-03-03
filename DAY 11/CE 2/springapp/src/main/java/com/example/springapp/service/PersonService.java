package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Person;
import com.example.springapp.repo.PersonRepo;

@Service
public class PersonService {
    @Autowired
    PersonRepo personRepo;

    public Person addPerson(Person person)
    {
        return personRepo.save(person);
    }

    public List<Person> getPerson()
    {
        return personRepo.findAll();
    }
} 
