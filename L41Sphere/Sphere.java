package com.company.L41Sphere;

import java.text.DecimalFormat;

public class Sphere {

    DecimalFormat decimalFormat = new DecimalFormat("0.###");

    private double diameter;

    public Sphere(double input) {
        this.diameter = input;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    private double volume() {

        double v = (4 / 3) * Math.PI * Math.pow(getDiameter(), 3);
        return v;
    }

    private double surface() {
        double a = 4 * Math.PI * Math.pow(getDiameter(), 2);
        return a;
    }

    public String toString(){
        return "The volume of the sphere is " + decimalFormat.format(volume()) + "\nThe surface of the sphere is " + decimalFormat.format(surface());
    }

}
