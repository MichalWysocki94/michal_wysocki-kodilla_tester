package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Hyundai;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Toyota;


public class CarUtils {

    public static void describeCar(Car car){
        System.out.println("-----------------------------");
        System.out.println("Car model: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Hyundai)
            return "Hyundai";
        else if (car instanceof Skoda)
            return "Skoda";
        else if (car instanceof Toyota)
            return "Toyota";
        else
            return "Unknown shape name";
    }
}
