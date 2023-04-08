package com.example.first_homework.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.Random;


@RestController
@RequestMapping(value = "/json")
public class JsonController {
    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JsonDTO> returnNewJson(@RequestBody JsonDTO request) {
        Random rand = new Random();
        request.info.id = rand.nextInt();
        return new ResponseEntity<>(request, HttpStatus.OK);
    }

    @GetMapping(value = "/getError")
    public ResponseEntity<?> returnMyError() throws HttpServerErrorException {
        throw new HttpServerErrorException(HttpStatus.BAD_GATEWAY);
    }
}


