package com.example.springapp;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student {
    long id;
    String name;
    @JsonIgnore
    String description;

    public Student(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}