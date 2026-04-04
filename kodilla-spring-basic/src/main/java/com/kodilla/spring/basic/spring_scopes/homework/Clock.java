package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {

    private LocalTime time = LocalTime.now();

    public LocalTime getTime() {
        return time;
    }

    public Clock(){
        System.out.println(time);
    }

}
