package com.example.first_homework;

import com.example.first_homework.event.AsyncEvent;
import com.example.first_homework.event.CommonEvent;
import com.example.first_homework.event.TransactionalEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EventService {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public String generateCommonEvent() {
        var event = new CommonEvent();
        applicationEventPublisher.publishEvent(event);
        return "Common event";
    }

    public String generateAsyncEvent() {
        var event = new AsyncEvent();
        applicationEventPublisher.publishEvent(event);
        return "Async event";
    }

    @Transactional
    public String generateTransactionalEvent() throws Exception {
        var event = new TransactionalEvent();
        applicationEventPublisher.publishEvent(event);
        return "Transactional event";
    }

    @Transactional
    public String generateTransactionalErrorEvent() {
        try {
            var event = new TransactionalEvent();
            event.makeError();
            applicationEventPublisher.publishEvent(event);
            return "Transactional event";
        } catch (Exception ex) {
            return "Transactional event with error";
        }
    }
}
