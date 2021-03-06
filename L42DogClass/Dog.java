package com.company.L42DogClass;

public class Dog {

    private int yearsInput = 0;
    private String dogName = new String();
    private int dogYears = 0;

    public Dog(int yearsInput, String dogName) {
        this.yearsInput = yearsInput;
        this.dogName = dogName;
    }

    public int getYearsInput() {
        return yearsInput;
    }

    public void setYearsInput(int yearsInput) {
        this.yearsInput = yearsInput;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int dogYearsCalculation(){
        return dogYears =  yearsInput * 7;
    }

    public String toString(){
        return "Dog's name is " + getDogName() + " and he is " + dogYearsCalculation() + " human years old";
    }


}
