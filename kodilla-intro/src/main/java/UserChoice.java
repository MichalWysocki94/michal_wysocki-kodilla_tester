import java.util.Scanner;

public class UserChoice {
    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (G-green, O-orange, R-red, B-blue, W-white,):");
            String choose = scanner.nextLine().trim().toUpperCase();
            switch (choose) {
                case "G": return "GREEN";
                case "O": return "ORANGE";
                case "R": return "RED";
                case "B": return "BLUE";
                case "W": return "WHITE";
                default:
                    System.out.println("Wrong name. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        String color = UserChoice.getUserSelection();
        System.out.println("Wybrany kolor to: " + color);
    }

}
