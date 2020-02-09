package ru.hacker.abstractfabric.factories;

import ru.hacker.abstractfabric.buttons.Button;
import ru.hacker.abstractfabric.buttons.WindowsButton;
import ru.hacker.abstractfabric.checkbox.Checkbox;
import ru.hacker.abstractfabric.checkbox.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}