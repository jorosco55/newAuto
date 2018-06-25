package com.company.auto;

public class Car extends Auto {

    String stereo;
    String speakers;
    String hydros;

    public String carFeatures(){
        String s = super.toString();
        s += "\nStereo: " + stereo;
        String speak = super.toString();
        speak += "\nSpeakers: "+ speakers;
        return (make + model + year + s + speak);

    }
}
