package ru.hacker.duck;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Я не умею летать!");
    }
}
