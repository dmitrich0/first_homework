package com.example.first_homework.event;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class TransactionalEvent {
    public TransactionalEvent(int year) throws Exception {
        log.info("Transactional event has been created");
        if (year < 0 || year > 2023) {
            throw new Exception();
        }
    }
}
