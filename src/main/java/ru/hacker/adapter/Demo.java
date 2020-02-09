package ru.hacker.adapter;

import ru.hacker.adapter.round.RoundHole;
import ru.hacker.adapter.round.RoundPeg;
import ru.hacker.adapter.square.SquarePeg;

/**
 * Где-то в клиентском коде...
 */
public class Demo {
    public static void main(String[] args) {
        // Круглое к круглому — всё работает.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Круглый колышек r5 подходит для круглого отверстия r5");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        // Адаптер решит проблему.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Колышек w2 подходит для круглого отверстия r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Квадратный колышек w20 не вписывается в круглое отверстие r5.");
        }
    }
}
