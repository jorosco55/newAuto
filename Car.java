package com.company.auto;

public class Car extends Auto {

    String stereo;
    String speakers;
    String hydros;

    public String toString() {
        String stereo = super.toString();
        stereo += "\nStereo: " + stereo;
        String speak = super.toString();
        speak += "\nSpeakers: " + speakers;
        return (stereo + speak);
    }

    public void setStereo(String stereo) {
        this.stereo = stereo;
        }

    public String getStereo() {
        return stereo;
        }

    public void setSpeakers(String speakers) {
        this.speakers = speakers;
        }
    public String getSpeakers(){
        return speakers;
    }
}
