package com.example.first_homework.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CommonListener {
    @EventListener
    public void handle(CommonEvent event) {
        log.info("Common event has been handled");
    }
}
