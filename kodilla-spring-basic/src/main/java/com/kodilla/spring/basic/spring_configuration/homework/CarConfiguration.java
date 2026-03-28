package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.util.Locale.of;

@Configuration
public class CarConfiguration {

    @Bean
    public Car car() {
        LocalDateTime time = LocalDateTime.now();
        int month = time.getMonthValue();
        int day = time.getDayOfMonth();

        Car car = null;
        return car;
    }
}
