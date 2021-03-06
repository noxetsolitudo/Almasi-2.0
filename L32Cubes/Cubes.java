package com.company.L32Cubes;

import java.util.Scanner;

public class Cubes {

    Scanner scanner = new Scanner(System.in);
    private double cube1Side = 0;
    private double cube2Side = 0;
    private double cube1volume = 0;
    private double cube2volume = 0;

    public void calculation() {
        System.out.println("Please enter the side of cube 1:");
        cube1Side = scanner.nextDouble();
        cube1volume = Math.pow(cube1Side, 3);
        System.out.println("Please enter the side of cube 2:");
        cube2Side = scanner.nextDouble();
        cube2volume = Math.pow(cube2Side, 3);
    }

    public String toString(){
        return "The volume of cube 1 is: " + cube1volume + "The volume of cube 2 is: " + cube2volume;
    }
}

//TODO preco toto nefunguje????

//    public double[] calculation() {
//        System.out.println("Please enter the side of cube 1:");
//        cube1Side = scanner.nextDouble();
//        cube1volume = Math.pow(cube1Side, 3);
//        System.out.println("Please enter the side of cube 2:");|
//        cube2Side = scanner.nextDouble();
//        cube2volume = Math.pow(cube2Side, 3);
//
//        double cal[] = new double[2];
//        cal[0] = cube1volume;
//        cal[1] = cube2volume;
//        return cal;