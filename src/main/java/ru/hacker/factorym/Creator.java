package ru.hacker.factorym;

public interface Creator extends Product {

    /**
     * Вызывается конкретной реализацией для получения явного экземпляра
     */
    Product createProduct();
}
