package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;


class ShippingCenterTestSuite {

    private final ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    private final ShippingCenter bean = context.getBean(ShippingCenter.class);

    @Test
    public void shouldReturnSuccessDelivery(){
        //when
        String notification = bean.sendPackage("Piotrkowska 51", 29);
        //then
        Assertions.assertEquals("Package delivered to: Piotrkowska 51", notification);
    }

    @Test
    public void shouldReturnFailDelivery(){
        //when
        String notification = bean.sendPackage("Piotrkowska 51", 31);
        //then
        Assertions.assertEquals("Package not delivered to: Piotrkowska 51", notification);
    }

    @Test
    public void shouldReturnSuccessDeliveryForWeight30Kg(){
        //when
        String notification = bean.sendPackage("Piotrkowska 51", 30);
        //then
        Assertions.assertEquals("Package delivered to: Piotrkowska 51", notification);
    }



}