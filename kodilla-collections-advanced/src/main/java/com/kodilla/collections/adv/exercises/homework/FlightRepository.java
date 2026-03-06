package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;


public class FlightRepository {

    public static List<Flight> getFlightsTable() {

        List<Flight> flights = new ArrayList<>();

        flights.add(new Flight("Warszawa", "Budapeszt"));
        flights.add(new Flight("Warszawa", "Londyn"));
        flights.add(new Flight("Londyn", "Sopot"));
        flights.add(new Flight("Barcelona", "Wroclaw"));
        flights.add(new Flight("Poznań", "Budapeszt"));
        flights.add(new Flight("Warszawa", "Bukareszt"));
        flights.add(new Flight("Londyn", "Warszawa"));
        flights.add(new Flight("Wroclaw", "Monachium"));
        flights.add(new Flight("Warszawa", "Praga"));
        flights.add(new Flight("Warszawa", "Berlin"));
        flights.add(new Flight("Wroclaw", "Madryt"));
        flights.add(new Flight("Katowice", "Wilno"));
        flights.add(new Flight("Warszawa", "Barcelona"));
        flights.add(new Flight("Gdansk", "Praga"));
        flights.add(new Flight("Radom", "Zadar"));

        return flights;
    }


















//        List<Flight> flights = new ArrayList<>();
//
//        flights.add(new Flight("Warszawa", "Praga"));
//        flights.add(new Flight("Warszawa", "Berlin"));
//        flights.add(new Flight("Wroclaw", "Madryt"));
//        flights.add(new Flight("Katowice", "Wilno"));
//        flights.add(new Flight("Warszawa", "Barcelona"));
//        flights.add(new Flight("Gdansk", "Praga"));
//        flights.add(new Flight("Radom", "Zadar"));
//
//        return flights;
//    }


//    public static List<Flight> getFlightsTable () {
//        FlightRepository flightRepository = new FlightRepository();
//
//        flightRepository.addFlight("Warszawa", new Flight("Praga", "Helsinki"));
//        flightRepository.addFlight("Warszawa", new Flight("Barcelona", "Kijow"));
//        flightRepository.addFlight("Wroclaw", new Flight("Madryt","Bratyslawa"));
//        flightRepository.addFlight("Katowice", new Flight("Berlin", "Wilno"));
//
//        List<Flight> result = flightRepository.flightRepository.getOrDefault("Warszawa", new ArrayList<>());
//
//        return result;
//        return flightRepository.getOrDefault(airportName, new ArrayList<>());
//    }



}
