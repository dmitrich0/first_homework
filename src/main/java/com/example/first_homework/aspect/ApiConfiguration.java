package com.example.first_homework.aspect;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties("first.homework")
@ConstructorBinding
@Getter
public class ApiConfiguration {
    private Integer maxApiCalls;

    public ApiConfiguration(Integer maxApiCalls) {
        this.maxApiCalls = maxApiCalls;
    }
}
