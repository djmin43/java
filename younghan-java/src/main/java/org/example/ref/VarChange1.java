package org.example.ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a = 30;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        String aStr = "hello";
        String bStr = aStr;
        aStr = "bye";

        System.out.println("a str = " + aStr);
        System.out.println("b str = " + bStr);

    }
}
