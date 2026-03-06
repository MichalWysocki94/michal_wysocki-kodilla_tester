package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    public void testFilterChemistGroupUsernames() {
        //given
        UsersRepository.getUsersList();
        //when
        List<String> result = UsersManager.filterChemistGroupUsernames();
        //then
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Gale Boetticher");
        assertEquals(expectedList, result);


    }

    @Test
    public void testOlderThan(){
        //given
        UsersRepository.getUsersList();
        //when
        List<User> result = UsersManager.olderThan(47);
        //then
        List<User> expectedList = new ArrayList<>();
        expectedList.add(new User("Walter White", 50, 7, "Chemists"));
        expectedList.add(new User("Gus Firing", 49, 0, "Board"));
        expectedList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(expectedList, result);

    }

}