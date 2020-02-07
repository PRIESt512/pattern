package ru.hacker.duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super();
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Я реальная дикая утка!");
    }
}
