public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        int[] arrayNumbers = {1, 50, 100, 200};
        sumArray(arrayNumbers);
    }
    private static void sumArray(int[] arrayNumbers) {
        int sum = 0;

        for (int i = 0; i < arrayNumbers.length; i++) {
            sum = sum + arrayNumbers[i];
        }

        System.out.println(sum);
    }

}