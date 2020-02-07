package ru.hacker.delegat;

public class B {

    private A a;

    public B() {
        a = new A();
    }

    public void operation() {
        a.operation();
    }

    public void operation2() {
        System.out.println("Я класс B");
    }
}
