package com.company.L57RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    private String choice = "";


    public String choice(int userInput) {
        switch (userInput) {
            case 1:
                choice = "Rock";
                break;
            case 2:
                choice = "Paper";
                break;
            case 3:
                choice = "Scissors";
                break;
            default:
                choice = "Nothing";
                break;
        }
        return choice;
    }


}
