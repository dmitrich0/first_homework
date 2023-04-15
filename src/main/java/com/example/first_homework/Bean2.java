package com.example.first_homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@ConditionalOnBean(Bean1.class)
public class Bean2 {
    @PostConstruct
    private void postConstruct() {
        System.out.println("Bean2 has been created");
    }
}
