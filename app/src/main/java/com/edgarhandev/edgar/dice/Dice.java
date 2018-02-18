package com.edgarhandev.edgar.dice;

import java.util.Random;

/**
 * Created by edgar on 8/19/17.
 */

public class Dice {
    private Random random;
    private int sides;

    public Dice() {
        init(6);
    }

    public Dice(int sides) {
        init(sides);
    }

    private void init(int sides) {
        random = new Random();
        this.sides = sides;
    }

    public int roll() {
        return random.nextInt(sides) + 1;
    }
}
