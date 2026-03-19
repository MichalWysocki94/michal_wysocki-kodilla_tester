package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AlertService {

    Map<String, Set<Person>> subscriptions = new HashMap<>();

    public void subscribe(Person person, String city) {

            subscriptions.computeIfAbsent(city, c -> new HashSet<>()).add(person);
    }

    public void sendAlert(String city, Alert alert) {
        if (subscriptions.containsKey(city)){
            subscriptions.get(city).forEach(person -> person.receive(alert));
        }
    }

    public void unsubscribeCity (String city, Person person){
        if (subscriptions.containsKey(city)){
            subscriptions.get(city).remove(person);
        }
    }

    public void unsubscribeFromAllCities(Person person) {
        subscriptions.values().forEach(set -> set.remove(person));
    }


    public void sendAlertToAll(Alert alert) {
        Set<Person> allPersons = new HashSet<>();
        subscriptions.values().forEach(allPersons::addAll);
        allPersons.forEach(person -> person.receive(alert));
    }

    public void removeCity(String city) {
        if (subscriptions.containsKey(city)){
            subscriptions.remove(city);
        }
    }



}
