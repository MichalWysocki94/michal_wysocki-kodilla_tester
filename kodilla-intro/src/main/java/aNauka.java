import java.util.Random;

public class aNauka {

    public static void main(String[] args) {


        Random random = new Random();
        int c = random.nextInt(10) + 1;

        for (int i = 0; i < 20; i++){
            int r = random.nextInt(71) + 50;
            System.out.println("Wylosowana liczba to: " + r);
        }


        int a = 7;
        int b = 12;

        if (a > b) {
            System.out.println(a + " jest większe od " + b);
        } else if (a < b) {
            System.out.println(a + " jest mniejsze od " + b);
        } else {
            System.out.println(a + " jest równe " + b);
        }


        int age = 17;

        if (age >= 18) {
            System.out.println("Dorosły");
        } else {
            System.out.println("Nieletni");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        int[] numbers = {2, 5, 8, 1, 9};
        int[] numbers123 = {25, 54, 888, 14, 95};
        int[] losoweliczby = {12, 52, 68, 71, 98};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Suma z tablicy wynosi: " + sum);
        System.out.println("Średnia z tablicy wynosi: " + sum / numbers.length);


        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maksymalna wartość w tablicy: " + max);

        int suma = aNauka.sum(numbers);
        System.out.println(suma);

        int suma2 = aNauka.sum(numbers123);
        System.out.println(suma2);
        int sumRandomNumbers = aNauka.sum(losoweliczby);
        System.out.println(sumRandomNumbers);

        boolean ageMarek = aNauka.isAdult(15);
        System.out.println("Marek jest dorosły? " + ageMarek);

        double averageOfNumbers = aNauka.average(numbers123);
        System.out.println(averageOfNumbers);

    }

    static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    static boolean isAdult(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    static int max(int[] numbers) {
        if (numbers.length >= 1) {
            int max = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            return max;
        }
        return 0;
    }

    static double average(int[] numbers){
        if(numbers.length > 0) {
            double suma = aNauka.sum(numbers);
            double averageNumber = suma / numbers.length;
            return averageNumber;
        }
        return 0;
    }

    static String getDayName(int chosenNumber) {
            return switch (chosenNumber) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Wrong Number";
            };
    }
}
