package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {

    static Map<String, List<Flight>> flightRepository = new HashMap<>();


    public void addFlight(String airportName, Flight flight){
        List<Flight> flights = flightRepository.getOrDefault(airportName, new ArrayList<>());
        flights.add(flight);
        flightRepository.put(airportName,flights);

    }

    public static List<Flight> getFlightsTable (String airportName) {
        /* FlightRepository flightRepository = new FlightRepository();

        flightRepository.addFlight("Warszawa", new Flight("Praga", "Helsinki"));
        flightRepository.addFlight("Warszawa", new Flight("Barcelona", "Kijow"));
        flightRepository.addFlight("Wroclaw", new Flight("Madryt","Bratyslawa"));
        flightRepository.addFlight("Katowice", new Flight("Berlin", "Wilno"));

        List<Flight> result = flightRepository.flightRepository.getOrDefault("Warszawa", new ArrayList<>());

        return result; */
        return flightRepository.getOrDefault(airportName, new ArrayList<>());

    }



}
