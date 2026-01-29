package com.kodilla.abstracts.homework;

public class Ractangle extends Shape{

    private double a;
    private double b;

    public Ractangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double surfaceArea() {
        return a*b;
    }

    @Override
    public double circumference() {
        return a*2 + b*2;
    }
}
