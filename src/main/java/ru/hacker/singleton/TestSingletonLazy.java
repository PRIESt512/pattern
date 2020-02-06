package ru.hacker.singleton;

/**
 * С отложенной инициализацией используется в случаях, когда на создание
 * экземпляра Singleton тратится много ресурсов
 */
public class TestSingletonLazy {

    private static TestSingletonLazy INSTANCE;

    private TestSingletonLazy() {
    }

    public static TestSingletonLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TestSingletonLazy();
            return INSTANCE;
        }
        return INSTANCE;
    }
}
