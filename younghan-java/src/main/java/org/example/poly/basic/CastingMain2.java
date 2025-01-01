package org.example.poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        Parent poly = new Child();


        Child child = (Child)poly;
        child.childMethod();

        ((Child) poly).childMethod();



    }
}
