package com.company.L41Sphere;

import java.util.Scanner;

public class MultySphere {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double diameter = 0;

        System.out.println("Please insert the desired diameter: ");

        diameter = scanner.nextDouble();

        Sphere sphere = new Sphere(diameter);

        System.out.println(sphere);
    }
}
