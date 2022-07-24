package com.java.OOPClass;

public class Vehicle extends Crashable implements Drivable{
    double PI = 3.14;
    int numOfWheels = 2;
    double theSpeed = 0;
    int carStrength = 0;
    public int getWheel(){
       return this.numOfWheels;
    };
    public void setWheels(int numWheels){
        this.numOfWheels = numWheels;
    };
    public double getSpeed(){
        return this.theSpeed;
    };
    public void setSpeed(double speed){
        this.theSpeed = speed;
    }

    public Vehicle(int wheels, double speed){
        this.numOfWheels = wheels;
        this.theSpeed = speed;
    }

    public void setCarStrength(int carStrength) {
        this.carStrength = carStrength;
    }

    public int getCarStrength() {
        return this.carStrength;
    }
}
