package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.stream.homework.ForumStats.getAverageBefore40;
import static com.kodilla.stream.homework.ForumStats.getAverageOver40;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTest {

    @Test
    public void testGetAverageOver40() {

        //given
        List<User> users = new ArrayList<>();
        users.add(new User("Andrzej Nowak", 40, 100, "Agent"));
        users.add(new User("Ferdek Kiepski", 60, 56, "Filozof"));
        users.add(new User("Michal Szpak", 39, 510, "Wokalista"));
        users.add(new User("Justin Biber", 27, 10, "Wokalista"));
        users.add(new User("Jacek Sasin", 41, 111, "Zlotnik"));

        //when
        double avgPost = getAverageOver40(users);
        //then
        assertEquals(89, avgPost);
    }

    @Test
    public void testGetAverageBefore40(){
        //given
        List<User> users = new ArrayList<>();
        users.add(new User("Andrzej Nowak", 40, 100, "Agent"));
        users.add(new User("Ferdek Kiepski", 60, 56, "Filozof"));
        users.add(new User("Michal Szpak", 39, 510, "Wokalista"));
        users.add(new User("Justin Biber", 27, 10, "Wokalista"));
        users.add(new User("Jacek Sasin", 41, 111, "Zlotnik"));
        //when
        double avgPost = getAverageBefore40(users);
        //then
        assertEquals(260, avgPost);
    }

}