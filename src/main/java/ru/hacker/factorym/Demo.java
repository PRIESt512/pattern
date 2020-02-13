package ru.hacker.factorym;

import ru.hacker.factorym.creator.ConcreteTestA;
import ru.hacker.factorym.creator.ConcreteTestB;
import ru.hacker.factorym.creator.Test;

public class Demo {

    public static void main(String[] args) {
        boolean test = true;
        testProduct(false);
    }

    static void testProduct(boolean flag) {
        Test test = null;
        if (flag) {
            test = new ConcreteTestA();
        } else {
            test = new ConcreteTestB();
        }

        test.test();
    }
}
