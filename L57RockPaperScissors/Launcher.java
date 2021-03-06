package com.company.L57RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userChoice = 0;
        int computerChoice = 0;

        String user;
        String computer;
        int computerWinsCounter = 0;
        int playerWinsCounter = 0;
        int drawCounter = 0;
        int roundsCounter = 0;
        boolean toQuit = false;
        String anotherRound = "";

        while (toQuit == false) {

            System.out.println("Please choose:\n1) for ROCK\n2) for PAPER\n3) for SCISSORS");
            userChoice = scanner.nextInt();
//        System.out.println("----User has chosen----");

            computerChoice = random.nextInt(3) + 1;
//        System.out.println("----Computer has chosen----");

            RockPaperScissors rcp1 = new RockPaperScissors();
            user = rcp1.choice(userChoice);
            System.out.println("Player chose " + user);

            RockPaperScissors rcp2 = new RockPaperScissors();
            computer = rcp2.choice(computerChoice);
            System.out.println("Computer chose " + computer);

            if (user.equalsIgnoreCase("ROCK")) {
                if (computer.equalsIgnoreCase("PAPER")) {
                    System.out.println("Computer wins!");
                    computerWinsCounter++;
                } else if (computer.equalsIgnoreCase("SCISSORS")) {
                    System.out.println("Player wins!");
                    playerWinsCounter++;
                } else {
                    System.out.println("Draw!");
                    drawCounter++;
                }
            } else if (user.equalsIgnoreCase("PAPER")) {
                if (computer.equalsIgnoreCase("ROCK")) {
                    System.out.println("Player wins!");
                    playerWinsCounter++;
                } else if (computer.equalsIgnoreCase("SCISSORS")) {
                    System.out.println("Computer wins!");
                    computerWinsCounter++;
                } else {
                    System.out.println("Draw!");
                    drawCounter++;
                }
            } else if (user.equalsIgnoreCase("SCISSORS")) {
                if (computer.equalsIgnoreCase("ROCK")) {
                    System.out.println("Computer wins!");
                    computerWinsCounter++;
                } else if (computer.equalsIgnoreCase("PAPER")) {
                    System.out.println("Player wins!");
                    playerWinsCounter++;
                } else {
                    System.out.println("Draw!");
                    drawCounter++;
                }
            }
            roundsCounter++;
            System.out.println("Would you like to play another round?\nPress \"Y\" for YES and \"N\" for NO");
            anotherRound = scanner.next();
            if (anotherRound.equalsIgnoreCase("Y")) {
                toQuit = false;
            } else {
                toQuit = true;
            }
        }
        System.out.println("Results:\nYou played " + roundsCounter + " round(s).\nPlayer won: " + playerWinsCounter + ".\nComputer won: " + computerWinsCounter +
                "\nDraws: " + drawCounter);
        System.out.println("Good bye!");
    }
}
