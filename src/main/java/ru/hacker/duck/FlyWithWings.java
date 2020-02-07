package ru.hacker.duck;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Я умею летать!");
    }
}
