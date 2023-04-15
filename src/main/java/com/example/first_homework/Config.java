package com.example.first_homework;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import javax.annotation.PostConstruct;
import java.util.List;

@ConfigurationProperties("first.homework")
@ConstructorBinding
public class Config {
    private List<String> list;
    private String env;

    public Config(List<String> list, String env) {
        this.list = list;
        this.env = env;
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println(list);
        System.out.println(env);
    }
}
