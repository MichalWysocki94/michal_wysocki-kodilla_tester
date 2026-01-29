package com.kodilla.inheritance.homework;

public class LinuxSystem extends OperatingSystem{

    public LinuxSystem(int releaseYear){
        super(releaseYear);
    }

    @Override
    public void welcome(){
        System.out.println("Welcome in Linux");
    }

}
