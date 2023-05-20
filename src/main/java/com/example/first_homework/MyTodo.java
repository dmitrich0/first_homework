package com.example.first_homework;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Entity
@Table(name = "todos")
@AllArgsConstructor
@NoArgsConstructor
@Getter()
public class MyTodo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Version
    private Long version;

    private String name;

    private String[] events;
}
