package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {


    public void addOrder(Order order){

    }

    public List<Order> getOrdersBetweenDates(LocalDate date1, LocalDate date2){
        return Collections.emptyList();
    }

    public List<Order> getOrdersBetweenPrices(double lowest, double highestPrice){
        return Collections.emptyList();
    }

    public int getNumberOfOrders(){
        return 0;
    }

    public double sumAllOrders(){
        return 0;
    }




//    private List<Order> orders = new ArrayList<>();
//
//    public void addOrder(Order order){
//        this.orders.add(order);
//    }
//
//    public List<Order> getOrdersBetweenDates(LocalDate date1, LocalDate date2){
//
//        List<Order> result = new ArrayList<>();
//
//        for (Order order : orders) {
//            if (!order.getDate().isBefore(date1) && !order.getDate().isAfter(date2))
//                result.add(order);
//        }
//        return result;
//    }





}
