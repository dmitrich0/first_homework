package com.example.first_homework.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/headers")
public class HeaderController {
    @GetMapping()
    public String[] getHeaders(@RequestHeader Map<String, String> headers) {
        return headers.keySet().toArray(new String[0]);
    }
}
