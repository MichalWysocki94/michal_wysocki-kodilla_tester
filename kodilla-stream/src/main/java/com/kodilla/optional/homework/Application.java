package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Adam", new Teacher("Henryk")));
        students.add(new Student("Wojtek", new Teacher("Zdzislaw")));
        students.add(new Student("Marek", new Teacher("Henrietta")));
        students.add(new Student("Patryk", new Teacher("Henrietta")));
        students.add(new Student("Julia", new Teacher("Piotr")));
        students.add(new Student("Krzysztof", null));
        students.add(new Student("Celina", null));

        for (Student student : students){
            String teacherName = student.getTeacher()
                    .map(Teacher::getName)
                    .orElse("<undefined>");

            System.out.println("uczen: " + student.getName() + ", nauczyciel: " + teacherName);

        }


    }
}
