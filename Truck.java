package com.company.auto;


public class Truck extends Auto {

    String flatbed;
    String lifts;

    public String truckFeatures() {
        String bed = super.toString();
        bed += "\nFlatbed: "+ flatbed;
        String l = super.toString();
        l += "\nLifts: " + lifts;
        return (make + model + year + bed + l);

    }


}
