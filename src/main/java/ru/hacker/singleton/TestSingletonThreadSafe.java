package ru.hacker.singleton;


/** Отложенная инициализация поля экземпляра — синхронизированный метод доступа
 * Применимо во многопоточном доступе
 */
public class TestSingletonThreadSafe {

    private static TestSingletonThreadSafe INSTANCE;

    private TestSingletonThreadSafe() {
    }

    public static synchronized TestSingletonThreadSafe getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TestSingletonThreadSafe();
            return INSTANCE;
        }
        return INSTANCE;
    }
}
