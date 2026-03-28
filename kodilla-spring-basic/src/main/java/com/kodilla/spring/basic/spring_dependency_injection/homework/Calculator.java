package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private final Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b){
        double value = a + b;
        display.display(value);
        return value;
    }

    public double subtract(double a, double b){
        double value = a - b;
        display.display(value);
        return value;
    }

    public double multiply(double a, double b){
        double value = a * b;
        display.display(value);
        return value;
    }

    public double divide(double a, double b){

        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        double value = a / b;
        display.display(value);
        return value;

    }

}
