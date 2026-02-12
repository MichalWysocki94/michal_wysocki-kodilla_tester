package com.kodilla.collections.adv.maps.homework;

import java.util.*;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();

        Principal jan = new Principal("Jan", "Borowski");
        Principal zdzislaw = new Principal("Zdzislaw", "Oczko");
        Principal anna = new Principal("Anna", "Kowal");


        List<Integer> classes9 = new ArrayList<>();
        classes9.add(20);
        classes9.add(18);
        classes9.add(25);
        classes9.add(25);

        School szkolaNr9 = new School("Szkola numer 9", classes9);
        System.out.println(szkolaNr9);


        List<Integer> classes1 = new ArrayList<>();
        classes1.add(20);
        classes1.add(25);
        classes1.add(26);
        classes1.add(23);

        School szkolaNr1 = new School("Szkola numer 1", classes1);
        System.out.println(szkolaNr1);

        List<Integer> classes5 = new ArrayList<>();
        classes5.add(14);
        classes5.add(15);
        classes5.add(18);
        classes5.add(14);

        School szkolaNr5 = new School("Szkola numer 5", classes5);
        System.out.println(szkolaNr5);

        schools.put(jan, szkolaNr9);
        schools.put(zdzislaw, szkolaNr1);
        schools.put(anna, szkolaNr5);

        for (Map.Entry<Principal,School> school : schools.entrySet()){
            System.out.println("Dyrektorem " + school.getValue().schoolName + " jest " + school.getKey().getName() + " " + school.getKey().getLastName() + ". W tej szkoly uczy sie: " + school.getValue().getTotalStudents() + " uczniów.");

        }


    }
}
