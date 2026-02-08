package com.kodilla.collections.interfaces;

public class Square implements Shape {
    double width;

    public Square(double width){
        this.width = width;
    }

    public double getArea(){
        return this.width * this.width;
    }

    public double getPerimeter(){
        return this.width * 4;
    }

}
