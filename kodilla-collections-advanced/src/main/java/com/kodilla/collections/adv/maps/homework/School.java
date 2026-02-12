package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    String schoolName;
    List<Integer> students = new ArrayList<>();

    public School(String schoolName, List<Integer> students) {
        this.schoolName = schoolName;
        this.students = students;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public List<Integer> getStudents() {
        return students;
    }

    public int getTotalStudents(){
        int sum = 0;
        for(int number : students){
            sum += number;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", students=" + students +
                '}';
    }
}
