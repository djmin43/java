package org.example.more.functional;

@FunctionalInterface
interface Calculator {
    int sum(int a, int b);
}

class MyCalculator implements Calculator {
    public int sum(int a, int b) {
        return a+b;
    }
}

public class Sample {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        Calculator nc = (int a, int b) -> a + b;
        int sum = nc.sum(3, 5);
        System.out.println("sum = " + sum);
        int result = mc.sum(3, 4);
        System.out.println("result = " + result);
    }
}
