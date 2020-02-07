package ru.hacker.duck;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super();
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    public void setFly(FlyBehavior fly) {
        this.flyBehavior = fly;
    }

    public void setQuack(QuackBehavior quack) {
        this.quackBehavior = quack;
    }

    @Override
    public void display() {

    }
}
