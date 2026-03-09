package com.kodilla.exception.homework;


public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("01/02/2025"));
        warehouse.addOrder(new Order("02/02/2025"));
        warehouse.addOrder(new Order("03/02/2025"));
        warehouse.addOrder(new Order("04/02/2025"));


        try {
            Order order = warehouse.getOrder("05/02.2025");
            System.out.println("Order number: " + order.getNumber());

        } catch (OrderDoesntExistException e) {
            System.out.println("Takie zamowienie nie istnieje");

        } finally {
            System.out.println("Dziękuje za skorzystanie z magazynu");
        }


    }
}
