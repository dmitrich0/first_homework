package com.example.first_homework.web;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Random;


@Getter
class JsonDTO {
    Number price;
    Info info;
}

@Getter
class Info {
    String date;
    Number id;
}

@RestController
@RequestMapping(value = "/json")
public class JsonController {
    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = MediaType.ALL_VALUE)
    public ResponseEntity<JsonDTO> returnNewJson(@RequestBody JsonDTO request) {
        Random rand = new Random();
        request.info.id = rand.nextInt();
        return new ResponseEntity<JsonDTO>(request, HttpStatus.OK);
    }
}

@ControllerAdvice
class DefaultAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler(HttpServerErrorException.BadGateway.class)
    protected ResponseEntity<Object> badGatewayHandler(HttpServerErrorException.BadGateway e) {
        return new ResponseEntity<>("Ошибка 502!", HttpStatus.BAD_GATEWAY);
    }
}
