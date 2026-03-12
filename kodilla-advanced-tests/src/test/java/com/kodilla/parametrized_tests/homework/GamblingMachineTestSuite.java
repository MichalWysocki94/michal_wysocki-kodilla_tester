package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers2.csv", numLinesToSkip = 1)
    public void shouldThrowException(String numbers) {
        Set<Integer> set = Arrays.stream(numbers.split(";"))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(set));
    }












//    @ParameterizedTest
//    @CsvFileSource(resources = "/numberOfWins.csv", numLinesToSkip = 1)
//        public void shouldReturnNumberOfWins(Set<Integer> myNumbers,Set<Integer> computerNumbers,int wins) throws InvalidNumbersException {
//        assertEquals(wins, gamblingMachine.howManyWins(myNumbers));
//    }




//    @ParameterizedTest
//    @CsvFileSource(resources = "/notCorrectSize.csv", numLinesToSkip = 1)
//    public void shouldReturnNotCorrectSize(Set<Integer> numbers, boolean expected){
//        assertEquals(expected, gamblingMachine.isNotCorrectSize(numbers));
//    }

}