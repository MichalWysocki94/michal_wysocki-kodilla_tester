public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[5];

        names[0] = "Wojtek";
        names[1] = "Andrzej";
        names[2] = "Michal";
        names[3] = "Arek";
        names[4] = "Grzegorz";

        String myName = names[2];
        System.out.println(myName);

        int numberOfElements = names.length;

        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");

    }
}