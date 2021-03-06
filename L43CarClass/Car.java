package com.company.L43CarClass;

import java.util.Scanner;

public class Car {

    Scanner scanner = new Scanner(System.in);

    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        while(year <1950){
            System.out.println("Please enter valid year, it must be more or equal to 1950");
            year = scanner.nextInt();
        }
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return "The make is: " + getMake() + "\nThe model is: " + getModel() + "\nThe year is: " + getYear();
    }
}
