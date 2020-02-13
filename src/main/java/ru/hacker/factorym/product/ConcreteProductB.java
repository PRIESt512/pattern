package ru.hacker.factorym.product;

import ru.hacker.factorym.product.Product;

public class ConcreteProductB implements Product {

    @Override
    public void doStuff() {
        System.out.println("ConcreteProductB");
    }
}
