package com.company.L33PhoneNumber;

import java.util.Random;

public class Launch {
    public static void main(String[] args) {

        Random random = new Random();

        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int secondSequence;
        int thirdSequence;
        int counter = 0;

        String middleNumbers;
        String lastNumbers;

        while (counter < 30) {

            firstNumber = random.nextInt((7 - 0) + 1) + 0;
            secondNumber = random.nextInt((7 - 0) + 1) + 0;
            thirdNumber = random.nextInt((7 - 0) + 1) + 0;
            secondSequence = random.nextInt((742 - 0) + 1) + 0;
            thirdSequence = random.nextInt((9999 - 0) + 1) + 0;

            middleNumbers = Integer.toString(secondSequence);
            while (middleNumbers.length() < 3) {
                middleNumbers = "0" + middleNumbers;
            }

            lastNumbers = Integer.toString(thirdSequence);
            while (lastNumbers.length() < 4) {
                lastNumbers = "0" + lastNumbers;
            }

            System.out.println("The random phone number is : " + firstNumber + secondNumber + thirdNumber +
                    "-" + middleNumbers + "-" + lastNumbers);

            counter++;
        }
    }
}
//rand.nextInt((max - min) + 1) + min;
