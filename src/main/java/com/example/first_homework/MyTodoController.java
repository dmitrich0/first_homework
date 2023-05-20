package com.example.first_homework;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
@RequiredArgsConstructor
public class MyTodoController {
    private MyTodoService todoService;

    @PostMapping()
    public MyTodo createTodo(@RequestBody MyTodoDTO dto) {
        return todoService.createTodo(dto);
    }

    @GetMapping()
    public List<MyTodo> getAllTodos() {
        return todoService.getAllTodos();
    }
}
