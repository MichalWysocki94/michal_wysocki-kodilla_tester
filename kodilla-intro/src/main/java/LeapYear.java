public class LeapYear {
    public static void main(String[] args) {
        int year = 2026;

        System.out.println(year);

        if (year % 400 == 0) {
            System.out.println("To jest rok przestępny");
        } else if (year % 100 == 0) {
            System.out.println("To nie jest rok przestępny");
        } else if (year % 4 == 0) {
            System.out.println("To jest rok przestępny");
        } else {
            System.out.println("To nie jest rok przestępny");
        }
    }
}