package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void shouldReturnSuccessDelivery(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        //given
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        //when
        String notification = bean.sendPackage("Piotrkowska 51", 23);
        //then
        Assertions.assertEquals("Package delivered to: Piotrkowska 51", notification);
    }

    @Test
    public void shouldReturnFailDelivery(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        //given
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        //when
        String notification = bean.sendPackage("Piotrkowska 51", 35);
        //then
        Assertions.assertEquals("Package not delivered to: Piotrkowska 51", notification);
    }

}