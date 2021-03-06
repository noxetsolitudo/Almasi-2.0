package com.company.L57RPSAdvanced;

import java.util.Scanner;

public class Player extends Enums {

    private Scanner scanner;

    //TODO constructor --->> if extending classes, you have to initialize objects in the constructor + call a super class.
    public Player() {
        super();
        scanner = new Scanner(System.in);
    }

    public CHOICES getChoice() {
        System.out.println("Please enter your choice, 'R'=ROCK, 'P'=PAPER, 'S'=SCISSORS.");
        char choice = scanner.nextLine().toUpperCase().charAt(0);

        switch (choice) {
            case 1:
                return CHOICES.ROCK;
            case 2:
                return CHOICES.PAPER;
            case 3:
                return CHOICES.SCISSORS;
        }
        //TODO if none of the above, it is invalid input and this message will be printed and in return, there will be prompt for repeating the function return getChoices();
        System.out.println("Invalid input, please try again!");
        return getChoice();
    }
}
