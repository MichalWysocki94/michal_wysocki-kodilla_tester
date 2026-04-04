package com.kodilla.spring.basic.spring_scopes.homework;

import com.kodilla.spring.basic.spring_scopes.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClockTestSuite {

    @Test
    public void shouldCreateDiffrentClock() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        Thread.sleep(1);
        Clock secondBean = context.getBean(Clock.class);
        Thread.sleep(1);
        Clock thirdBean = context.getBean(Clock.class);
        Assertions.assertNotEquals(firstBean.getTime(), secondBean.getTime());
        Assertions.assertNotEquals(secondBean.getTime(), thirdBean.getTime());
        Assertions.assertNotEquals(firstBean.getTime(), thirdBean.getTime());

    }
}