import java.util.ArrayList;
import java.util.List;

public class aNauka2 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        cities.add("Warsaw");
        cities.add("Krakow");
        cities.add("Gdansk");
        cities.add("Wroclaw");
        cities.add("Poznan");
        cities.add("Elk");
        cities.add("Bialystok");

        for (String city : cities){
            System.out.println(city);
        }
        System.out.println("--------------------------");
        System.out.println(cities.get(0));
        System.out.println(cities.get(4));
        System.out.println("--------------------------");

        cities.set(1, "Suwalki");
        cities.remove(3);

        System.out.println("--------------------------");
        for (String city : cities){
            System.out.println(city);
        }
        System.out.println("--------------------------");

        System.out.println("Czy tablica zawiera Gdansk: " + cities.contains("Gdansk"));
        System.out.println("Rozmiar tablicy: " + cities.size());
        System.out.println("Ostatni element: " + cities.get(cities.size() - 1));

        cities.remove("Warsaw");


            if (cities.contains("Poznan")) {
                int index = cities.indexOf("Poznan");
                cities.set(index, "Torun");
            }

        System.out.println("--------------------------");
        System.out.println(cities);

        System.out.println("--------------------------");

        if (cities.size() > 3){
            System.out.println("Lista ma więcej niż 3 elementy");
            for (String city : cities)
                System.out.println(city);
        }




//        for (String city : cities){
//            if (city.equals("Poznan")){
//                city.set("Torun");
//            }
//        }


    }
}
