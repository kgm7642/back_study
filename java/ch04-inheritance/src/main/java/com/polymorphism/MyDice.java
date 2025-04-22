package com.polymorphism;

import java.util.Random;

public class MyDice extends Dice{
    @Override
    public int getNumber() {
        int[] choices = {4, 44, 444};
        return choices[new Random().nextInt(choices.length)];
    }
}
