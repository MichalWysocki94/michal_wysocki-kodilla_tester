package com.kodilla.collections.adv.exercises.homework;

import java.util.List;

public class App {
    public static void main(String[] args) {

        FlightFinder finder = new FlightFinder();

        System.out.println("Loty z Warszawy:");
        List<Flight> flightsFromWarsaw =
                finder.findFlightsFrom("Warszawa");

        for (Flight flight : flightsFromWarsaw) {
            System.out.println(flight);
        }

        System.out.println("\nLoty do Warszawy:");
        List<Flight> flightsToWarsaw =
                finder.findFlightsTo("Warszawa");

        for (Flight flight : flightsToWarsaw) {
            System.out.println(flight);
        }
    }

//        FlightFinder flightFinder = new FlightFinder();
//
//        List<Flight> lotyZWarszawy= flightFinder.findFlightsFrom("Warszawa");
//        String result = "";
//        for (Flight flight : flightFinder.findFlightsFrom("Warszawa")){
//            result += flight.getArrival() + " ";
//        }
//        System.out.println(result);
//    }

}
