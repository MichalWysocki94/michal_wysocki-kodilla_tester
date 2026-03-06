import java.util.HashMap;
import java.util.Map;

public class NaukaMap {
    public static void main(String[] args) {

        Map<String,Integer> products = new HashMap<>();

        products.put("Laptop", 3000);
        products.put("Phone", 2000);
        products.put("Tablet", 1500);

        if (products.containsKey("Phone")){
            products.put("Phone", 2200);
        }

        for (Map.Entry<String, Integer> product : products.entrySet()){
            System.out.println("Produkt: " + product.getKey() + " Cena: " + product.getValue());
        }

        System.out.println("Czy istnieje cena 1500? " + products.containsValue(1500));

        for (Map.Entry<String, Integer> product : products.entrySet()){
            if (product.getValue() > 2000){
                System.out.println("Produkt: " + product.getKey() + " Cena: " + product.getValue());
            }
        }

    }
}
