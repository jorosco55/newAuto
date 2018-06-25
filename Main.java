package com.company.auto;

public class Main {

    public static void main(String[] args) {

        Truck newTruck = new Truck();
        Car newCar = new Car();

        newTruck.myAuto("Ford", "F-150", 2019);
        newCar.myAuto("Chevy", "Impala", 1964);

        System.out.println(newTruck.truckFeatures());
        System.out.println(newCar.carFeatures());

    }
}
