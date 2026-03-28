package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator bean = context.getBean(Calculator.class);

    @Test
    public void shouldReturnCorrectSum (){

        double sum = bean.add(6.2, 3.8);
        Assertions.assertEquals(10.0, sum, 0.001);
    }

    @Test
    public void shouldReturnCorrectSubtraction() {

        double subtract = bean.subtract(13.5,3.5);
        Assertions.assertEquals(10.0, subtract, 0.001);
    }

    @Test
    public void shouldReturnCorrectDivideNumber() {

        double dividedNumber = bean.divide(12.0, 3.0);
        Assertions.assertEquals(4.0, dividedNumber, 0.001);
    }

    @Test
    public void shouldReturnCorrectMultiplication() {

        double multiplication = bean.multiply( 6.0, 8.0);
        Assertions.assertEquals(48.0, multiplication, 0.001);
    }

    @Test
    public void shouldThrowExceptionWhenDividingByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            bean.divide(12.0, 0.0);
        });
    }

}