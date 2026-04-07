package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class CarConfigurationTestSuite {

    private final CarConfiguration carConfiguration = new CarConfiguration();

    @Test
    void shouldReturnSUVInWinter() {
        Car car = carConfiguration.car(LocalDateTime.of(2024, 1, 10, 22, 0));

        Assertions.assertEquals("SUV", car.getCarType());
        Assertions.assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    void shouldReturnCabrioInSummer() {
        Car car = carConfiguration.car(LocalDateTime.of(2024, 7, 10, 12, 0));

        Assertions.assertEquals("Cabrio", car.getCarType());
        Assertions.assertFalse(car.hasHeadlightsTurnedOn());
    }
}