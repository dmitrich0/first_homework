package com.example.first_homework.controller;

import com.example.first_homework.event.AsyncEvent;
import com.example.first_homework.event.CommonEvent;
import com.example.first_homework.event.TransactionalEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/event")
public class EventController {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @GetMapping("/common")
    public String generateCommonEvent() {
        var event = new CommonEvent();
        applicationEventPublisher.publishEvent(event);
        return "Common event";
    }

    @GetMapping("/async")
    public String generateAsyncEvent() {
        var event = new AsyncEvent();
        applicationEventPublisher.publishEvent(event);
        return "Async event";
    }

    @GetMapping("/transactional")
    @Transactional
    public String generateTransactionalEvent() throws Exception {
        var event = new TransactionalEvent(1917);
        applicationEventPublisher.publishEvent(event);
        return "Transactional event";
    }

    @GetMapping("/transactionalError")
    @Transactional
    public String generateTransactionalErrorEvent() {
        try {
            var event = new TransactionalEvent(-150);
            applicationEventPublisher.publishEvent(event);
            return "Transactional event";
        } catch (Exception ex) {
            return "Transactional event with error";
        }
    }
}
