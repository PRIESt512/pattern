package ru.hacker.factorym;

public class ConcreteProductB implements Creator {

    @Override
    public void doStuff() {
        System.out.println("ConcreteProductB");
    }

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
