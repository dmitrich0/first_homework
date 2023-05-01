package com.example.first_homework;

import com.example.first_homework.aspect.ApiConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApiConfiguration.class)
public class FirstHomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstHomeworkApplication.class, args);
    }

}
