package ru.hacker.abstractfabric.factories;

import ru.hacker.abstractfabric.buttons.Button;
import ru.hacker.abstractfabric.buttons.MacOSButton;
import ru.hacker.abstractfabric.checkbox.Checkbox;
import ru.hacker.abstractfabric.checkbox.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
