package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Hyundai;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];

        for(int n = 0; n < cars.length; n++){
            cars[n] = drawCar();
        }
        for(Car car : cars){
            CarUtils.describeCar(car);
        }
    }


    public static Car drawCar() {
        Random random = new Random();
        int drawnModelCar = random.nextInt(3);
        int speedBoosts = random.nextInt(6) + 1; // 1–6 przyspieszeń

        Car car;

        if (drawnModelCar == 0) {
            car = new Hyundai();
        } else if (drawnModelCar == 1) {
            car = new Skoda();
        } else {
            car = new Toyota();
        }

        for (int i = 0; i < speedBoosts; i++) {
            car.increaseSpeed();
        }

        return car;
    }




    /* public static Car drawCar(){

        Random random = new Random();

        int drawnModelCar = random.nextInt(3);

        double a = speedUp(random);
        if(drawnModelCar == 0) {
            return new Hyundai();
        } else if (drawnModelCar == 1) {
            double b = speedUp(random);
            return new Skoda();
        } else {
            double c = speedUp(random);
            return new Toyota();
        }

    } */

    /*private static double speedUp(Random random) {
        double speed = random.nextDouble() * 100 + 1;
        return speed;       // possible values: 1.000-100.999...
    }*/
}
