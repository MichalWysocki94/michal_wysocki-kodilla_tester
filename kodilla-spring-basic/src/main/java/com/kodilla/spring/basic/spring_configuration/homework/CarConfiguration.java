package com.kodilla.spring.basic.spring_configuration.homework;



import java.time.LocalDateTime;
import java.time.Month;


public class CarConfiguration {


    public LocalDateTime currentTime() {
        return LocalDateTime.now();
    }


    public Car car(LocalDateTime currentTime) {

        Month month = currentTime.getMonth();
        int hour = currentTime.getHour();

        boolean lightsOn = (hour >= 20 || hour < 6);

        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return new SUV(lightsOn);
            case JUNE:
            case JULY:
            case AUGUST:
                return new Cabrio(lightsOn);
            default:
                return new Sedan(lightsOn);
        }
    }
}