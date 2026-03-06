import java.util.HashSet;
import java.util.Set;

public class NaukaSet {
    public static void main(String[] args) {

        Set<String> colors = new HashSet<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");

        System.out.println(colors);

        System.out.println("Czy zawiera Blue: " + colors.contains("Blue"));
        System.out.println("-----------------------");
        colors.remove("Green");
        System.out.println(colors);

        System.out.println("-----------------------");

        if (colors.contains("Blue")){
            colors.remove("Blue");
        }

        colors.add("Yellow");

        if (colors.size() >= 2){
            System.out.println(colors);
        }

    }
}
