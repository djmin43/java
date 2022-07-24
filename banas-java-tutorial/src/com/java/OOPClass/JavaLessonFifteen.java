package com.java.OOPClass;

public class JavaLessonFifteen {

    public static void main(String[] args){
        Vehicle car = new Vehicle(4, 100.00);
        System.out.println("Car Max Speed: " + car.getSpeed());
        System.out.println("Number of wheels:" + car.getWheel());

        car.setCarStrength(10);
        System.out.println(car.getCarStrength());



    }
}
