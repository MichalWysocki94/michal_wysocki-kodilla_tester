package com.kodilla.inheritance.homework;

public class App {
    public static void main (String[] args){

        WindowsSystem windows = new WindowsSystem(2020);
        windows.turnOn();
        System.out.println("This operating system was realised in " + windows.getReleaseYear());

        LinuxSystem linux = new LinuxSystem(1994);
        linux.turnOff();
        System.out.println("This operating system was realised in " + linux.getReleaseYear());


    }
}
