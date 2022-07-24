package com.java.OOPClass;

public class Vehicle implements Drivable{
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
}
