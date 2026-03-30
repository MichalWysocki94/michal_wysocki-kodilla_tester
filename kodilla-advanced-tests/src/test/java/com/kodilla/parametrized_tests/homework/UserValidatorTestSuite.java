package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseIfSringIsEmptyOrNullInUsername(String text){
        assertFalse(userValidator.validateUsername(text));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseIfSrtingIsEmptyOrNullInEmail(String text){
        assertFalse(userValidator.validateEmail(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"MiChal94", "Wojtek-20","Maciek_94_03_25","JAN04213"})
    public void shouldReturnTrueIfStringInUsernameIsCorrect(String text){
        assertTrue(userValidator.validateUsername(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"MiChal$%94", "Wojt./ek-20","Maci#!k_94_03_25","JA!N_04213"})
    public void shouldReturnFalseIfStringInUsernameIsIncorrect(String text){
        assertFalse(userValidator.validateUsername(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"michal_94@doa.pl", "Wojt.ek20@ops.com","Maciek_94_03_25@ol.it","JAN04213@gw.hl"})
    public void shouldReturnTrueIfStringInEmailIsCorrect(String text){
        assertTrue(userValidator.validateEmail(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"m@ic@hal_94@doa.pl", "Wojt,ek20@op.s.com","Mac,,i.ek_94_03_25@ol.it","JAN042$%^13@gw.hl"})
    public void shouldReturnFalseIfStringInEmailIsIncorrect(String text){
        assertFalse(userValidator.validateEmail(text));
    }

}