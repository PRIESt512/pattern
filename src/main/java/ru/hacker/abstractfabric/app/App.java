package ru.hacker.abstractfabric.app;

import ru.hacker.abstractfabric.buttons.Button;
import ru.hacker.abstractfabric.checkbox.Checkbox;
import ru.hacker.abstractfabric.factories.GUIFactory;

/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
public class App {
    private Button button;
    private Checkbox checkbox;

    public App(GUIFactory factory) {// либо фабрика Windows, либо фабрика MacOS
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}