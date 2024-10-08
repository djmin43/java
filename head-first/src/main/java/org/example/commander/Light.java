package org.example.commander;

public class Light {
    String type;

    public Light(String type) {
        this.type = type;
    }

    public void on() {
        System.out.println(type + "Light on");
    }

    public void off() {
        System.out.println(type + "Light off");
    }
}
