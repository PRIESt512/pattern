package ru.hacker.abstractfabric.checkbox;

/**
 * Все семейства продуктов имеют одинаковые вариации (MacOS/Windows).
 * <p>
 * Вариация чекбокса под Windows.
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Создали WindowsCheckbox.");
    }
}