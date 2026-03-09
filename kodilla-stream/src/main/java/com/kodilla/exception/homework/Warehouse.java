package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {

    List<Order> orders = new ArrayList<>();


    public void addOrder(Order order){
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {

        List<Order> foundOrders = orders
                .stream()
                .filter(o -> o.getNumber().equals(number))
                .collect(Collectors.toList());

        if (foundOrders.size() > 0){
            return foundOrders.get(0);
        }
        throw new OrderDoesntExistException();
    }

}
