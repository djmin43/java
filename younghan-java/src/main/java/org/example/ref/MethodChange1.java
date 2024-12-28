package org.example.ref;

public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("before method a =  " + a);
        changePrimitive(a);
        System.out.println("after method a =  " + a);

    }

    public static void changePrimitive(int x) {
        x = 20;
    }
}
