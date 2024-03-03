package com.example.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.PassPort;
import com.example.springapp.service.PassPortService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class PassPortController {
    @Autowired
    PassPortService passPortService;

    @PostMapping("/addpass")
    public PassPort addPassPort(@RequestBody PassPort passPort) {
        
        return passPortService.addPassPort(passPort);
    }

    @GetMapping("/getpass")
    public List<PassPort> gePassPorts() {
        return passPortService.getPassPorts();
    }
    
    
}
 