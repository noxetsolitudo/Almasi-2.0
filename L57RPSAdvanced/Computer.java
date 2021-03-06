package com.company.L57RPSAdvanced;

import java.util.Random;

public class Computer extends Enums {

    private Random random;

    //TODO constructor --->> if extending classes, you have to initialize objects in the constructor + call a super class.
    public Computer() {
        super();
        random = new Random();
    }

    public CHOICES getChoice() {
        int choice = random.nextInt(3) + 1;

        switch (choice) {
            case 1:
                return CHOICES.ROCK;
            case 2:
                return CHOICES.PAPER;
        }
        return CHOICES.SCISSORS;
    }


}
