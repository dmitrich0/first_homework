package com.example.first_homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@ConditionalOnExpression("'${first.homework.env}' != 'default'")
public class Bean3 {
    @PostConstruct
    private void postConstruct() {
        System.out.println("Been 3 has been created");
    }
}
