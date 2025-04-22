package com.polymorphism;

import java.util.Random;

public class SuperDice extends Dice {
    private int min;
    private int max;

    public SuperDice() {
        this.max = 10;
        this.min = 1;
    }

    @Override
    public int getNumber() {
        return new Random().nextInt(max - min + 1) + min;
    }
}
