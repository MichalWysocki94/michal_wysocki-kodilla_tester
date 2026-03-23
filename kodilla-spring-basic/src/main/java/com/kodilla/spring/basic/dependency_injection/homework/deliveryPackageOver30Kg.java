package com.kodilla.spring.basic.dependency_injection.homework;

public class deliveryPackageOver30Kg implements DeliveryService{
    @Override
    public boolean deliverPackage(String address, double weight) {

        System.out.println("Package too heavy");
        return false;
    }
}
