package com.example.first_homework.controller;

import com.example.first_homework.aspect.ApiAudit;
import org.springframework.stereotype.Service;

@Service
public class ApiService {
    @ApiAudit
    public String getApiData() {
        return "777";
    }
}
