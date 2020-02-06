package ru.hacker.factorym;

public class ConcreteProductA implements Creator {

    @Override
    public void doStuff() {
        System.out.println("ConcreteProductA");
    }

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
