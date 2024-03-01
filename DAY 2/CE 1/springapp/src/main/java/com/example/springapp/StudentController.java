package com.example.springapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
   @Value("${app.name}")
   public String appName;

   @Value("${app.version}")
   public String appVersion;

   @GetMapping("/info")
   public String getMethodName() {
      return ("AppName: " + appName + "AppVersion: " + appVersion);
   }
}