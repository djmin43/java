package org.example.poly.overridnng;

public class OverridingMain {

    public static void main(String[] args) {

//        Child child = new Child();
//        System.out.println("child -> Child");
//        System.out.println("value - " + child.value);
//        child.method();

        Child parent = new Child();
        System.out.println("OverridingMain.main = " + parent.value);

    }
}
