package com.kodilla.inheritance.homework;

public class WindowsSystem extends OperatingSystem{


    public WindowsSystem(int releaseYear){
        super(releaseYear);
    }


    public void welcomeWindows(){
        System.out.println("Welcome in Windows");
    }

}
