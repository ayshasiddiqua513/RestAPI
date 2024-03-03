package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.PassPort;
import com.example.springapp.repo.PassPortRepo;

@Service
public class PassPortService {
    @Autowired
    PassPortRepo passPortRepo;

    public PassPort addPassPort(PassPort passPort)
    {
        return passPortRepo.save(passPort);
    }

    public List<PassPort> getPassPorts()
    {
        return passPortRepo.findAll();
    }
}
