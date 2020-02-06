package ru.hacker.singleton;

/**
 * Идиома класса отложенной инициализации для статических полей
 */
public class TestSingletonThreadSafePerformance {

    private static TestSingletonThreadSafePerformance INSTANCE = computedValue();

    private TestSingletonThreadSafePerformance() {
    }

    private static TestSingletonThreadSafePerformance computedValue() {
        return new TestSingletonThreadSafePerformance();
    }

    public static TestSingletonThreadSafePerformance getInstance() {
        return INSTANCE;
    }
}
