package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YearTest {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();
        System.out.println("WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! WOW it's true! ");

        //then
        assertTrue(isLeapYear);
    }
    @Test
    public void shouldNotBeLeapYearIfDivisibleBy100() {

        //given
        Year year = new Year(300);

        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertFalse(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy4() {

        //given
        Year year = new Year(1680);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertTrue(isLeapYear);
    }
    @Test
    public void shouldNotBeLeapYearIfDivisibleByOtherThan4And100And400() {

        //given
        Year year = new Year(1999);

        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertFalse(isLeapYear);
    }

}

