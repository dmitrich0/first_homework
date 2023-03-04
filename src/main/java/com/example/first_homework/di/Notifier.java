package com.example.first_homework.di;

import org.springframework.stereotype.Service;

@Service
public class Notifier {
    public void notifyStart(String object) {
        System.out.printf("A %s has been started", object);
    }

    public void notifyStop(String object) {
        System.out.printf("A %s has been stopped", object);
    }
}
