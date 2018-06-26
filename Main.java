package com.company.auto;

public class Main {

    public static void main(String[] args) {

        Truck truck = new Truck();
        truck.setMake("Ford");
        truck.setModel("F-150");
        truck.setYear("Fifty-Six");

        Car car = new Car();
        car.setMake("Chevy");
        car.setModel("Impala");
        car.setYear("Six-Duece!!");
        car.setStereo("Alpine");
        car.setSpeakers("Kickers");




        System.out.println("Here is an Old School "+ truck.getMake() + " " + truck.getModel() + " " + truck.getYear());

        System.out.println("This is an OG ride: " + car.getMake() + " " + car.getModel() + " " + car.getYear() + " For the riders, with customized " + car.getStereo() + " stereo" +
                " and two 15 inch " + car.getSpeakers());

    }
}
