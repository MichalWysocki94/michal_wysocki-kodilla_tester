package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println(getAverageOver40(UsersRepository.getUsersList()));
        System.out.println("--------------------");
        System.out.println(getAverageBefore40(UsersRepository.getUsersList()));
    }

    public static double getAverageOver40(List<User> users) {
        return users
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(u -> u.getNumberOfPost())
                .average()
                .getAsDouble();

    }

    public static double getAverageBefore40(List<User> users) {
        return users
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(u -> u.getNumberOfPost())
                .average()
                .getAsDouble();
    }

}
