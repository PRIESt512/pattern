package ru.hacker.duck;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    //что нас не интересует, что это за объект, важно лишь
    //то, чтобы он умел это делать
    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public abstract void display();
}
