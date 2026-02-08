package com.kodilla.collections.interfaces.homework;

public class Hyundai implements Car{

    int speed = 0;
    String name = "Hyundai";

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 15;
    }

    @Override
    public void decreaseSpeed() {
        speed -= -3;
    }
}
