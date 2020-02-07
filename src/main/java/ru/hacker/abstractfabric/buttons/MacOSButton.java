package ru.hacker.abstractfabric.buttons;

import ru.hacker.abstractfabric.buttons.Button;

/**
 * Все семейства продуктов имеют одни и те же вариации (MacOS/Windows).
 *
 * Это вариант кнопки под MacOS.
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("Создали MacOSButton.");
    }
}
