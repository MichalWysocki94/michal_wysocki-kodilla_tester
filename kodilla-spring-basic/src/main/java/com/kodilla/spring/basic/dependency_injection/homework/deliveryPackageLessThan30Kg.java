package com.kodilla.spring.basic.dependency_injection.homework;

public class deliveryPackageLessThan30Kg implements DeliveryService{
    @Override
    public boolean deliverPackage(String address, double weight) {
        
        System.out.println("Delivering in progress...");
        return true;
    }
}
