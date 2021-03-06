package com.company.L42DogClass;

import java.util.Scanner;

public class Kennel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int years = 0;
        String name = "";

        System.out.println("Please insert the age and the name op your dog:");

        years = scanner.nextInt();
        name = scanner.next();

        Dog dog1 = new Dog(years,name) ;


        dog1.setDogName("DICK");
        dog1.setYearsInput(15);

        System.out.println(dog1);


    }
}