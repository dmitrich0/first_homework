package com.example.first_homework.di.computers;

import com.example.first_homework.di.Notifier;
import com.example.first_homework.di.processor.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Desktop implements Computer {
    Boolean isStarted = false;
    @Autowired
    public Notifier notifier;
    private Processor processor;

    @Autowired
    public Desktop(Processor processor) {
        this.processor = processor;
    }

    @Override
    public String getProcessorName() {
        return processor.getName();
    }


    @Override
    public void start() {
        isStarted = true;
        notifier.notifyStart(this.getClass().getName());
    }

    @Override
    public void stop() {
        isStarted = false;
        notifier.notifyStop(this.getClass().getName());
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("✔ A desktop has been created");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("✖ A desktop has been destroyed");
    }
}
