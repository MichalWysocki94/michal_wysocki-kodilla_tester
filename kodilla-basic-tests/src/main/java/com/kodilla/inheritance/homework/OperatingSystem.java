package com.kodilla.inheritance.homework;

public class OperatingSystem {
    int releaseYear;

    public OperatingSystem(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public void turnOn(){
        System.out.println("System uruchomiony");
    }

    public void turnOff(){
        System.out.println("System wyłączony");
    }

    public int getReleaseYear(){
        return releaseYear;
    }

}
