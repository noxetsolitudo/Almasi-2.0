package com.company.L43CarClass;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String make = "";
        String model = "";
        int year = 0;

        System.out.println("Please enter the Make, Model and Year of the car:");
        make = scanner.next();
        model = scanner.next();
        year = scanner.nextInt();

        //TODO hodil som to do gettera
//        while(year <1950){
//            System.out.println("Please enter valid year, it must be more or equal to 1950");
//            year = scanner.nextInt();
//        }

        Car car1 = new Car(make,model,year);

        System.out.println(car1);

//        Car car2 = new Car("Mercedes","GLK",year);
//        System.out.println(car2);
    }
}
