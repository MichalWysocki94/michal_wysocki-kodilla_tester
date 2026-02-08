package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car{

    int speed = 0;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 20;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 5;
    }
}
