package com.ironhack;

public class Sedan extends Car {

    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);

        System.out.println("Sedan Information :" + toString());
    }

}