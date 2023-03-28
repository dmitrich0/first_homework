package com.example.first_homework;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;
import java.util.HashMap;

@RestControllerAdvice
public class PasswordAdvice {
    @ExceptionHandler({ConstraintViolationException.class})
    public ResponseEntity<?> handleNotValid(ConstraintViolationException ex) {
        var errors = ex.getConstraintViolations();
        var map = new HashMap<String, String>();
        for (var error : errors) {
            map.put("Violation", error.getMessage());
        }
        return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
    }
}
