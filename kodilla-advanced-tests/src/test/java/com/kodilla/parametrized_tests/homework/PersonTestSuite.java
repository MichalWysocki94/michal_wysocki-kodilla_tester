package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTestSuite {

//    Person person1 = new Person(1.56,56.5);
//    Person person2 = new Person(1.67,90.2);
//    Person person3 = new Person(1.78,68.6);
//    Person person4 = new Person(1.89,80.9);
//    Person person5 = new Person(1.75,100.2);

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.DoubleSourcesBMI#provideDoublesForCalulateBMI")
    public void shouldReturnCorrectStringBMI(double height, double weight, String info){
        Person person = new Person(height, weight);
        System.out.println(person.getBMI());
        assertEquals(info, person.getBMI());
    }


}