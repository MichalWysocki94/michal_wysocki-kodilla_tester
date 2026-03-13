package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTestSuite {

    private StringManipulator manipulator = new StringManipulator();

//    private static Stream<Arguments> shouldReturnStringLengthWithoutSpaces() {
//        return Stream.of(
//                Arguments.of("test", 4),
//                Arguments.of("OtHEr ", 5),
//                Arguments.of("E V e n t", 5),
//                Arguments.of("null ",4),
//                Arguments.of("A",1)
//        );
//    }

    @ParameterizedTest
    @CsvFileSource(resources = "/stringWithLowerCase.csv", numLinesToSkip = 1)
    public void shouldReturnReverseStringWithLowerCase(String input, String expected){
        assertEquals(expected, manipulator.reverseWithLowerCase(input));
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.StringSources#provideStringsForTestingLength")
    public void shouldReturnStringLengthWithoutSpaces(String input, int expected){
        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }

//    @ParameterizedTest
//    @CsvSource(value = {"test, 4", "OtHer, 5", "E V e n t, 5", "null, 4", "A, 1"})
//    public void shouldReturnStringLengthWithoutSpaces(String input, int expected){
//        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
//    }

    @ParameterizedTest
    @CsvFileSource (resources = "/countNumberOfCommas.csv", numLinesToSkip = 1, delimiter = ':')
    public void shouldReturnCountNumberOfCommas(String input, int expected){
        assertEquals(expected, manipulator.countNumberOfCommas(input));
    }
}