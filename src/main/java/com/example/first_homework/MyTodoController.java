package com.example.first_homework;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MyTodoController {
    MyTodoService todoService;

    @PostMapping()
    public MyTodo createTodo(@RequestBody MyTodoDTO dto) {
        return todoService.createTodo(dto);
    }

    @GetMapping()
    public List<MyTodo> getAllTodos() {
        return todoService.getAllTodos();
    }
}
