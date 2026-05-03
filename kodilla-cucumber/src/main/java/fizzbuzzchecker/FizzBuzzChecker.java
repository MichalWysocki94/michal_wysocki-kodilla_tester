package fizzbuzzchecker;

public class FizzBuzzChecker {
    public static String checkNumber(int number) {

        String result;

        if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else {
            result = "None";
        }
        return result;
    }
}
//    private static boolean isDateInSummer(MonthDay date) {
//        return date.isAfter(MonthDay.of(6,20))
//                && date.isBefore(MonthDay.of(9,24));
//    }

