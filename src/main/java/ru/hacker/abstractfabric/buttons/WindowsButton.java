package ru.hacker.abstractfabric.buttons;

import ru.hacker.abstractfabric.buttons.Button;

/**
 * Все семейства продуктов имеют одни и те же вариации (MacOS/Windows).
 * <p>
 * Это вариант кнопки под Windows.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Создали WindowsButton.");
    }
}