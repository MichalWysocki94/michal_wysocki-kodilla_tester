package com.kodilla.inheritance.homework;

public class LinuxSystem extends OperatingSystem{

    public LinuxSystem(int releaseYear){
        super(releaseYear);
    }

    public void welcomeLinux(){
        System.out.println("Welcome in Linux");
    }

}
