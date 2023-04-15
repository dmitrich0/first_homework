package com.example.first_homework;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Profile("test")
@Component
public class Bean1 {
    @PostConstruct
    private void postConstruct() {
        System.out.println("Bean1 has been created");
    }
}
