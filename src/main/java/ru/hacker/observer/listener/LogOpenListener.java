package ru.hacker.observer.listener;

import java.io.File;

public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Сохранение в лог " + log + ": Кто-то выполнил " + eventType + " работу со следующим файлом: " + file.getName());
    }
}
