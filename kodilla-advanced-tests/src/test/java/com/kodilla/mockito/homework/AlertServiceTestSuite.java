package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AlertServiceTestSuite {

    AlertService alertService = new AlertService();
    Alert alert = Mockito.mock(Alert.class);
    Person person = Mockito.mock(Person.class);
    Person person_2 = Mockito.mock(Person.class);
    Person person_3 = Mockito.mock(Person.class);
    String city_1 = "Warszawa";
    String city_2 = "Suwalki";
    String city_3 = "Katowice";




    @Test
    void personShouldGetAlertFromSubscribedCity(){
        alertService.subscribe(person, city_1);
        alertService.sendAlert(city_1, alert);
        Mockito.verify(person, Mockito.times(1)).receive(alert);
    }

    @Test
    void personCancelSubscriptionFromPointedCity(){
        alertService.subscribe(person, city_1);
        alertService.unsubscribeCity(city_1, person);
        alertService.sendAlert(city_1, alert);
        Mockito.verify(person, Mockito.never()).receive(alert);
    }

    @Test
    void personCancelAllSubscription(){
        alertService.subscribe(person, city_1);
        alertService.subscribe(person, city_2);
        alertService.subscribe(person, city_3);

        alertService.unsubscribeFromAllCities(person);

        alertService.sendAlert(city_1, alert);
        alertService.sendAlert(city_2, alert);
        alertService.sendAlert(city_3, alert);

        Mockito.verify(person, Mockito.never()).receive(alert);
    }

    @Test
    void alertFromTheCityGoesOnlyToPersonsWhoSubscribedThisCity(){
        alertService.subscribe(person, city_1);
        alertService.subscribe(person_2, city_2);
        alertService.subscribe(person_3, city_3);

        alertService.sendAlert(city_2, alert);

        Mockito.verify(person, Mockito.never()).receive(alert);
        Mockito.verify(person_2, Mockito.times(1)).receive(alert);

    }

    @Test
    void sendMessageToEveryPerson(){
        alertService.subscribe(person, city_1);
        alertService.subscribe(person_2, city_2);
        alertService.subscribe(person_3, city_3);

        alertService.sendAlertToAll(alert);

        Mockito.verify(person, Mockito.times(1)).receive(alert);
        Mockito.verify(person_2, Mockito.times(1)).receive(alert);
        Mockito.verify(person_3, Mockito.times(1)).receive(alert);


    }

    @Test
    void deleteTheCity(){
        alertService.subscribe(person, city_1);

        alertService.removeCity(city_1);

        alertService.sendAlert(city_1, alert);

        Mockito.verify(person, Mockito.never()).receive(alert);

    }

}
