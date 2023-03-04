package com.example.first_homework.di.processor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProcessorConfig {
    @Bean
    @Scope(value = "prototype")
    public Processor processor() {
        return new Processor("Intel");
    }
}
