package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp("Warszawa", 3.2, 2.0, false));
        stamps.add(new Stamp("Suwalki", 3.2, 3.2, false));
        stamps.add(new Stamp("Katowice", 3.2, 2.0, true));
        stamps.add(new Stamp("Wroclaw", 3.0, 3.0, false));

        stamps.add(new Stamp("Warszawa", 3.2, 2.0, false));


        System.out.println(stamps.size());

        for (Stamp stamp : stamps){
            if (stamp.isStamped() == true)
            System.out.println(stamp);
        }

    }
}
