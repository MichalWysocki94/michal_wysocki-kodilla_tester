package com.kodilla.collections.interfaces;

public class Circle implements Shape {

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter(){
        return this.radius * Math.PI * 2;
    }

}
