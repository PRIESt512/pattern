package ru.hacker.factorym.creator;

import ru.hacker.factorym.product.ConcreteProductB;
import ru.hacker.factorym.product.Product;

public class ConcreteTestB extends Test {

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
