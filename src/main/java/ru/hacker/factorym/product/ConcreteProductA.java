package ru.hacker.factorym.product;

import ru.hacker.factorym.product.Product;

public class ConcreteProductA implements Product {

    @Override
    public void doStuff() {
        System.out.println("ConcreteProductA");
    }
}
