package com.company.L31FirstLastName;

import java.util.Random;
import java.util.Scanner;

public class FirstLastname {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    private String firstName, lastName;
    private int rndNumber;

    public void userInputs(){
        System.out.println("Please enter your first name: ");
        firstName = scanner.next();
        System.out.println("Please enter your last name: ");
        lastName = scanner.next();
        while (lastName.length() < 5) {
            System.out.println("Your name is less than 5 characters, please input your name again:");
            lastName = scanner.next();
        }
        scanner.close();
    }

    public int numberGenerator(){
        rndNumber = random.nextInt((99-10)+1)+10;
        return rndNumber;
    }

    public String toString(){
        return "Your login is " + firstName.toLowerCase().substring(0,1) + lastName.toLowerCase().substring(0,4) + numberGenerator();

    }
}

//rand.nextInt((max - min) + 1) + min;