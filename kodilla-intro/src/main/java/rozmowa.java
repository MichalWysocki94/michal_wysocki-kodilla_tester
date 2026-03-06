package com.kodilla.flight;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Flight {
    String departure;
    String arrival;

    public Flight(String departure, String arrival) {
        this.arrival = arrival;
        this.departure = departure;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;
        return Objects.equals(departure, flight.departure) && Objects.equals(arrival, flight.arrival);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(departure);
        result = 31 * result + Objects.hashCode(arrival);
        return result;
    }
}

class FlightRepository {
    public static List<Flight> getFlightsTable() {
        return List.of(
                new Flight("WAW", "STS"),
                new Flight("KRK", "WAW"),
                new Flight("WAW", "KRK"),
                new Flight("WAW", "MIA"),
                new Flight("KRK", "MIA"),
                new Flight("MIA", "GDA"),
                new Flight("STS", "WAW")
        );
    }
}

class FlightFinder {
    //    public List<Flight> findFlightsFrom(String from) {
//        List<Flight> result = new ArrayList<>();
//        for (Flight flight : FlightRepository.getFlightsTable()) {
//            if (flight.getDeparture().equals(from)) {
//                result.add(flight);
//            }
//        }
//        return result;
//    }
    public List<Flight> findFlightsFrom(String from) {
        return FlightRepository.getFlightsTable().stream()
                .filter(flight -> flight.getDeparture().equals(from))
                .toList();
    }

    //    public List<Flight> findFlightsTo(String to) {
//        List<Flight> result = new ArrayList<>();
//        for (Flight flight : FlightRepository.getFlightsTable()) {
//            if (flight.getArrival().equals(to)) {
//                result.add(flight);
//            }
//        }
//        return result;
//    }
    public List<Flight> findFlightsTo(String to) {
        return FlightRepository.getFlightsTable().stream()
                .filter(flight -> flight.getArrival().equals(to)) // peson -> person.getAge() > 40
                .toList();
    }

    public String getConcatenatedDestinationsFrom(String from) {
        return FlightRepository.getFlightsTable().stream()
                .filter(flight -> flight.getDeparture().equals(from))
//                .map(flight -> flight.getArrival())
                .map(Flight::getArrival)
//                .map(FlightFinder::getArrivalAirportName)
                .collect(Collectors.joining("-"));
    }

//    public static String getArrivalAirportName(Flight flight) {
//        String airport = flight.getArrival().toUpperCase();
//        return airport;
//    }
}