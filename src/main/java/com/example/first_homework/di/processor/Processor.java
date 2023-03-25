package com.example.first_homework.di.processor;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

import javax.annotation.PostConstruct;

@FieldDefaults(level = AccessLevel.PROTECTED)
@Getter
@AllArgsConstructor
public class Processor {
    @NonNull
    String name;

    @PostConstruct
    private void postConstruct() {
        System.out.printf("A processor №%s has been created\n", this.hashCode());
    }
}
