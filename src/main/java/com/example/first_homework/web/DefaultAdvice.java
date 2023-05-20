package com.example.first_homework.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException;

@ControllerAdvice
class DefaultAdvice {
    @ExceptionHandler(HttpServerErrorException.class)
    protected ResponseEntity<Object> badGatewayHandler(HttpServerErrorException e) {
        return new ResponseEntity<>("Ошибка 502!", HttpStatus.BAD_GATEWAY);
    }
}
