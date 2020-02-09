package ru.hacker.proxy;

import java.lang.reflect.Proxy;

public class Demo {

    public static void main(String[] args) {
        UserImpl user = new UserImpl();
        User userProxy = (User) Proxy.newProxyInstance(
                UserImpl.class.getClassLoader(),
                UserImpl.class.getInterfaces(),
                new SomeInvocationHandler(user));
        userProxy.setName("Гриша");
        String h  = userProxy.getName() ;
        System.out.println(h);
        userProxy.rename("Вася");
    }
}

/**
 * На передаваемые параметры есть ряд ограничений:
 * Все объекты в массиве interfaces должны быть интерфейсами. Они не могут быть классами или примитивами.
 * В массиве interfaces не может быть двух одинаковых объектов.
 * Все интерфейсы в массиве interfaces должны быть загружены тем класс-лоадером, который передается в метод getProxyClass.
 * Все не публичные интерфейсы должны быть определены в одном и том же пакете, иначе генерируемый прокси-класс не сможет их все реализовать.
 * Ни в каких двух интерфейсах не может быть метода с одинаковым названием и сигнатурой параметров, но с разными типами возвращаемого значения.
 * Длина массива interfaces ограничена 65535-ю интерфейсами. Никакой Java-класс не может реализовывать более 65535 интерфейсов (а так хотелось!).
 */
