package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {

    //Map<String, List<Flight>> flightRepository = new HashMap<>();

    public List<Flight> findFlightsFrom(String departure){

        List<Flight> result = new ArrayList<>();

        for(Flight flight : FlightRepository.getFlightsTable()){
            if (flight.getDeparture().equals(departure)){
                result.add(flight);
            }
        }
        return result;
    }

    public List<Flight> findFlightsTo(String arrival){

        List<Flight> result = new ArrayList<>();

        for (Flight flight : FlightRepository.getFlightsTable()){
            if (flight.getArrival().equals(arrival)){
                result.add(flight);
            }
        }
        return result;

    }

}
