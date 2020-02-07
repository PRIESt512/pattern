package ru.hacker.abstractfabric.checkbox;

import ru.hacker.abstractfabric.checkbox.Checkbox;

/**
 * Все семейства продуктов имеют одинаковые вариации (MacOS/Windows).
 * <p>
 * Вариация чекбокса под MacOS.
 */
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Создали MacOSCheckbox.");
    }
}
