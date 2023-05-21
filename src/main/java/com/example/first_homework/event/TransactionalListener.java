package com.example.first_homework.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
@Slf4j
public class TransactionalListener {
    @TransactionalEventListener()
    public void handle(TransactionalEvent event) {
        log.info("Transactional event has been handled");
    }
}
