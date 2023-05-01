package com.example.first_homework.event;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class TransactionalEvent {
    private boolean process = false;
    public TransactionalEvent(boolean process) {
        this.process = process;
        log.info("Transactional event has been created");
    }
}
