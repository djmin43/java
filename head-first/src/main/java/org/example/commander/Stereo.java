package org.example.commander;

public class Stereo {

    public void on() {
        System.out.println("on");
    }

    public void off() {
        System.out.println("off");
    }

    public void setCd() {
        System.out.println("set cd");
    }

    public void setDvd() {
        System.out.println("set dvd");
    }

    public void setRadio() {
        System.out.println("set radio");
    }

    public void setVolume(int volume) {
        System.out.println("set volume to " + volume);
    }
}
