package ru.hacker;

import ru.hacker.singleton.TestSingletonLazy;

public class Start {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.hashCode());
        a.a = 5;
        System.out.println(a.hashCode());
    }

    static class A {
        int a = 10;
    }
}
