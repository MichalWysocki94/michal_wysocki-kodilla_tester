package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(4.7);
        System.out.println("Pole kwadratu wynosi " + square.surfaceArea());

        Triangle triangle = new Triangle(6,3,4,3);
        System.out.println("Obwod prostokąta wynosi " + triangle.circumference());

        Ractangle ractangle = new Ractangle(5,7);
        System.out.println("Pole prostokata wynosi " + ractangle.surfaceArea());

        Mechanic mechanic = new Mechanic();
        //System.out.println("Wynagrodzenie mechanika wynosi: " + mechanic.getSalary());
        Person person = new Person("Andrzej", 29, mechanic);

        person.showResponsibilities();
    }
}
