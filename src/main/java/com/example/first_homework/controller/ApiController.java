package com.example.first_homework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    ApiService apiService;

    @RequestMapping("/api1")
    public String getApi1() {
        return apiService.getApiData();
    }

    @RequestMapping("/api2")
    public String getApi2() {
        return apiService.getApiData();
    }
}
