package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DoubleSourcesBMI {
    static Stream<Arguments> provideDoublesForCalulateBMI(){
        return Stream.of(
                Arguments.of(1.72, 200.2, "Obese Class VI (Hyper Obese)"),
                Arguments.of(1.52, 130.2, "Obese Class V (Super Obese)"),
                Arguments.of(1.56, 115.2,"Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.66, 118.1,"Obese Class III (Very severely obese)"),
                Arguments.of(1.58, 90.2,"Obese Class II (Severely obese)"),
                Arguments.of(1.76, 95.2,"Obese Class I (Moderately obese)"),
                Arguments.of(1.68, 78.6,"Overweight"),
                Arguments.of(1.65,60.5,"Normal (healthy weight)"),
                Arguments.of(1.80, 56.5,"Underweight"),
                Arguments.of(1.76, 48.2,"Severely underweight"),
                Arguments.of(2.22, 63.2, "Very severely underweight")
        );
    }
}
