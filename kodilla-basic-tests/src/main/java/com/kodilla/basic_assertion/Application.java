package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);

        boolean correct = ResultChecker.assertEquals(13, sumResult);

        if (correct) {
            System.out.println("Fukncja sumująca dwie liczby: " + a + " i " + b + " dziala poprawnie");
        } else {
            System.out.println("Funkca sumująca dwie liczby: " + a + " i " + b + " jest niepoprawna");
        }

        int subtractResult = calculator.subtract(a, b);

        boolean correctSubtract = ResultChecker.assertEquals(-3, subtractResult);

        if (correctSubtract) {
            System.out.println("Fukncja odejmująca dwie liczby: " + a + " i " + b + " dziala poprawnie");
        } else {
            System.out.println("Funkca odejmująca dwie liczby: " + a + " i " + b + " jest niepoprawna");
        }

        int exponentiationResult = calculator.exponentiation(a);

        boolean correctExponentiation = ResultChecker.assertEquals(25, exponentiationResult);

        if (correctExponentiation) {
            System.out.println("Fukncja podnosząca liczbę " + a + " do potęgi drugiej dziala poprawnie");
        } else {
            System.out.println("Fukncja podnosząca liczbę " + a + " do potęgi drugiej jest niepoprawna");
        }
    }
}
