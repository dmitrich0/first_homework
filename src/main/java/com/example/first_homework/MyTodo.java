package com.example.first_homework;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Builder
@Entity
@Table(name = "todos")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter()
public class MyTodo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

    @Version
    Long version;

    String name;

    String[] events;
}
