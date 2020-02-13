package ru.hacker.factorym.creator;

import ru.hacker.factorym.product.ConcreteProductA;
import ru.hacker.factorym.product.Product;

public class ConcreteTestA extends Test {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
