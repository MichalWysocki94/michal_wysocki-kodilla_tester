package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testExponentiation1() {
        Calculator calculator = new Calculator();
        int a = 0;
        int powerResult = calculator.exponentiation(a);
        assertEquals(0, powerResult);
    }

    @Test
    public void testExponentiation2() {
        Calculator calculator = new Calculator();
        int a = 3;
        int powerResult = calculator.exponentiation(a);
        assertEquals(9, powerResult);
    }

    @Test
    public void testExponentiation3() {
        Calculator calculator = new Calculator();
        int a = -10;
        int powerResult = calculator.exponentiation(a);
        assertEquals(100, powerResult);
    }


}