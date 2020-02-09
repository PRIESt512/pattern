package ru.hacker.abstractfabric.app;

import ru.hacker.abstractfabric.factories.GUIFactory;
import ru.hacker.abstractfabric.factories.MacOSFactory;
import ru.hacker.abstractfabric.factories.WindowsFactory;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {

    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    private static App configureApplication() {
        App app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new App(factory);
        } else {
            factory = new WindowsFactory();
            app = new App(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        App app = configureApplication();
        app.paint();
    }
}
