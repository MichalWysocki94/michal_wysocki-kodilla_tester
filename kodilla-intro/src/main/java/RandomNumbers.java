import java.util.Random;

public class RandomNumbers {

    public void generateNumbers() {
        Random random = new Random();
        int sum = 0;
        int max = 0;
        int min = 30;  // bo liczby 0-30

        while (sum < 5000) {
            int temp = random.nextInt(31);  // losujemy 0-30
            sum = sum + temp;

            if (temp > max) {
                max = temp;
            } else if (temp < min) {
                min = temp;
            }
        }

        System.out.println("Największa: " + max);
        System.out.println("Najmniejsza: " + min);
        System.out.println("Suma wszystkich liczb: " + sum);
    }

    public static void main(String[] args) {
        RandomNumbers rn = new RandomNumbers();
        rn.generateNumbers();
    }
}