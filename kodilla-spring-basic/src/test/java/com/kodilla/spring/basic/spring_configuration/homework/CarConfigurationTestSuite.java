package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class CarConfigurationTestSuite {

    private final CarConfiguration carConfiguration = new CarConfiguration();

    @Test
    void shouldReturnSUVInWinterAt20_01() {
        Car car = carConfiguration.car(LocalDateTime.of(2024, 2, 10, 20, 1));

        Assertions.assertEquals("SUV", car.getCarType());
        Assertions.assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    void shouldReturnSUVInWinter() {
        Car car = carConfiguration.car(LocalDateTime.of(2024, 2, 10, 20, 0));

        Assertions.assertEquals("SUV", car.getCarType());
        Assertions.assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    void shouldReturnCabrioInSummer() {
        Car car = carConfiguration.car(LocalDateTime.of(2024, 6, 10, 19, 59));

        Assertions.assertEquals("Cabrio", car.getCarType());
        Assertions.assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    void shouldReturnSedanInAutumn() {
        Car car = carConfiguration.car(LocalDateTime.of(2024, 11, 22, 6, 1));

        Assertions.assertEquals("Sedan", car.getCarType());
        Assertions.assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    void shouldReturnSedanInSpring() {
        Car car = carConfiguration.car(LocalDateTime.of(2024, 4, 15, 6, 0));

        Assertions.assertEquals("Sedan", car.getCarType());
        Assertions.assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    void shouldReturnSedanInSpringAt5_59() {
        Car car = carConfiguration.car(LocalDateTime.of(2024, 4, 15, 5, 59));

        Assertions.assertEquals("Sedan", car.getCarType());
        Assertions.assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    void shouldReturnSedanInSpringAt00_00() {
        Car car = carConfiguration.car(LocalDateTime.of(2024, 4, 15, 0, 0));

        Assertions.assertEquals("Sedan", car.getCarType());
        Assertions.assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    void shouldReturnSedanInSpringAt23_59() {
        Car car = carConfiguration.car(LocalDateTime.of(2024, 4, 15, 23, 59));

        Assertions.assertEquals("Sedan", car.getCarType());
        Assertions.assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    void shouldReturnSedanInSpringAt00_01() {
        Car car = carConfiguration.car(LocalDateTime.of(2024, 4, 15, 0, 1));

        Assertions.assertEquals("Sedan", car.getCarType());
        Assertions.assertTrue(car.hasHeadlightsTurnedOn());
    }


}