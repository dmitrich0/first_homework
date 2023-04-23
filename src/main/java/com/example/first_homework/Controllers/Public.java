package com.example.first_homework.Controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;

@RestController()
@RequestMapping("/public")
public class Public {
    @GetMapping("/api")
    @PermitAll
    public String getPublicApi() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName() + " " + authentication.getAuthorities().toArray()[0];
    }
}
