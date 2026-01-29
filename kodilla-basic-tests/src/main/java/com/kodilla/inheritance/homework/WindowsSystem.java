package com.kodilla.inheritance.homework;

public class WindowsSystem extends OperatingSystem{


    public WindowsSystem(int releaseYear){
        super(releaseYear);
    }

    @Override
    public void welcome(){
        System.out.println("Welcome in Windows");
    }

}
