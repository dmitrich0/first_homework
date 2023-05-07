package com.example.first_homework.controller;

import com.example.first_homework.aspect.ApiAudit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    ApiService apiService;

    @RequestMapping("/api1")
    @ApiAudit
    public Object getApi1() {
        return apiService.getApiData();
    }

    @RequestMapping("/api2")
    @ApiAudit
    public Object getApi2() {
        return apiService.getApiData();
    }
}
