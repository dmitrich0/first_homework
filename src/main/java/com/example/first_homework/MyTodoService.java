package com.example.first_homework;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MyTodoService {

    private MyTodoRepository myTodoRepository;

    public MyTodo createTodo(MyTodoDTO dto) {
        var todo = MyTodo.builder()
                .name(dto.name)
                .events(dto.events)
                .build();
        return myTodoRepository.save(todo);
    }

    public List<MyTodo> getAllTodos() {
        return this.myTodoRepository.findAll();
    }
}
