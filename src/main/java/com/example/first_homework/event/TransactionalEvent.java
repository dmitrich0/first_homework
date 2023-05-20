package com.example.first_homework.event;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class TransactionalEvent {
    public TransactionalEvent() {
        log.info("Transactional event has been created");
    }

    public void makeError() throws Exception {
        throw new Exception();
    }
}
