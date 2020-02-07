package ru.hacker.duck;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Я умею крякать!");
    }
}
