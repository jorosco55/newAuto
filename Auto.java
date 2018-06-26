package com.company.auto;

public class Auto {
    String make;
    String model;
    String year;

    public Auto(){}



    public Auto(String myMake, String myModel, String myYear) {
        make = myMake;
        model = myModel;
        year = myYear;
    }

    public String toString() {
        return "Make: "+ make + "\nModel: " + model + "\nYear: " + year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getYear() {
        return year;
    }


}
