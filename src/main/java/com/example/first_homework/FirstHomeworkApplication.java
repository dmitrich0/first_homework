package com.example.first_homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Config.class)
public class FirstHomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstHomeworkApplication.class, args);
    }

}
