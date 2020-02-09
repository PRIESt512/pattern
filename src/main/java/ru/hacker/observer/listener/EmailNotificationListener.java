package ru.hacker.observer.listener;

import java.io.File;

public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email " + email + ": Кто-то выполнил " + eventType + " работу со следующим файлом: " + file.getName());

    }
}