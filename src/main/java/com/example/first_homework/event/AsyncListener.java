package com.example.first_homework.event;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AsyncListener {
    @EventListener
    @SneakyThrows
    @Async
    public void handle(AsyncEvent event) {
        Thread.sleep(1000);
        log.info("Async event has been handled");
    }
}
