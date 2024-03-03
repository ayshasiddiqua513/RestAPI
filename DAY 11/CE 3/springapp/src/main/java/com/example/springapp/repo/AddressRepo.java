package com.example.springapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.model.Address;

public interface AddressRepo extends JpaRepository<Address,Long> {
     
}