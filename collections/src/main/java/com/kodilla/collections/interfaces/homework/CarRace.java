package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Hyundai hyundai = new Hyundai();
        Skoda skoda = new Skoda();
        Toyota toyota = new Toyota();


        CarRace.doRade(hyundai);
        CarRace.doRade(skoda);
        CarRace.doRade(toyota);

    }

    public static void doRade(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println("Ten samochod osiagnal predkosc: " + car.getSpeed());
    }


}
