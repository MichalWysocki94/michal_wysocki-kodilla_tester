package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Hyundai;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        Skoda skoda = new Skoda();
        cars.add(new Toyota());
        cars.add(new Hyundai());
        cars.add(skoda);

        cars.remove(1);
        cars.remove(skoda);

        for (Car car : cars){
            CarUtils.describeCar(car);
        }

        System.out.println("-------------");
        System.out.println("Rozmiar kolekcji wynosi: " + cars.size());
    }
}
