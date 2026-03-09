package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("01/02/2025"));
        warehouse.addOrder(new Order("02/02/2025"));
        warehouse.addOrder(new Order("03/02/2025"));
        warehouse.addOrder(new Order("04/02/2025"));
        //when
        Order order = warehouse.getOrder("01/02/2025");
        //then
        assertEquals("01/02/2025", order.getNumber());
    }

    @Test
    public void testGetOrder_withException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("01/02/2025"));
        warehouse.addOrder(new Order("02/02/2025"));
        warehouse.addOrder(new Order("03/02/2025"));
        warehouse.addOrder(new Order("04/02/2025"));
        //when
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("06/02/2026"));
    }
}