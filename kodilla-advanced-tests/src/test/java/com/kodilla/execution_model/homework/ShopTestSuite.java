package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();

    Order order1 = new Order(45.50, LocalDate.of(2025, 12, 23), "Andrzejxd19");
    Order order2 = new Order(120.20, LocalDate.of(2026, 8, 25), "JeremyAhoy_2");
    Order order3 = new Order(300.70, LocalDate.of(2024, 5, 30), "Mietek56");
    Order order4 = new Order(750.00, LocalDate.of(2025, 6, 5), "MrocznyGrzybiarz94");
    Order order5 = new Order(410.20, LocalDate.of(2025, 1, 2), "Pamela1219");

    @BeforeEach
    public void initializeShop(){
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
    }


    @Test
    public void shouldAddOrderToShop(){
        //given
        shop.addOrder(order5);
        //when
        int numberOfOrders = shop.getNumberOfOrders();
        //then
        assertEquals(5,numberOfOrders);
    }

    @Test
    public void shouldReturnListOfOrdersBetweenSpecifiedDates(){
        //when
        List<Order> orders = shop.getOrdersBetweenDates(LocalDate.of(2025,1,1),LocalDate.of(2025,12,22));
        //then
        assertEquals(3,orders.size());
    }

    @Test
    public void shouldReturnListOfOrdersBetweenSpecifiedPrices(){
        //when
        List<Order> orders = shop.getOrdersBetweenPrices(100.00,500.00);
        //then
        assertEquals(3,orders.size());
    }

    @Test
    public void shouldReturnNumberOfOrders(){
        //when
        int result = shop.getNumberOfOrders();
        //then
        assertEquals(4,result);
    }

    @Test
    public void shouldSumAllOrders(){
        //when
        double result = shop.sumAllOrders();
        //then
        assertEquals(1620.60, result);
    }






}