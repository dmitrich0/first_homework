package com.example.first_homework.controller;

import com.example.first_homework.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping("/common")
    public String generateCommonEvent() {
        return this.eventService.generateCommonEvent();
    }

    @GetMapping("/async")
    public String generateAsyncEvent() {
        return this.eventService.generateAsyncEvent();
    }

    @GetMapping("/transactional")
    public String generateTransactionalEvent() throws Exception {
        return this.eventService.generateTransactionalEvent();
    }

    @GetMapping("/transactionalError")
    public String generateTransactionalErrorEvent() {
        return this.eventService.generateTransactionalErrorEvent();
    }
}
