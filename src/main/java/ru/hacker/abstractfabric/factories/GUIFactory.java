package ru.hacker.abstractfabric.factories;

import ru.hacker.abstractfabric.buttons.Button;
import ru.hacker.abstractfabric.checkbox.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}