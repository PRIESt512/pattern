package ru.hacker.singleton;

public class TestSingleton {

    private static final TestSingleton INSTANCE = new TestSingleton();

    private TestSingleton() {
    }

    public static TestSingleton getInstance() {
        return INSTANCE;
    }
}
