package com.example.first_homework;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyTodoRepository extends JpaRepository<MyTodo, Long> {
}
