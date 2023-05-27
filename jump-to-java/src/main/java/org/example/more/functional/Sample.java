package org.example.more.functional;

//@FunctionalInterface
//interface Calculator {
//    int sum(int a, int b);
//}

//class MyCalculator implements Calculator {
//    public int sum(int a, int b) {
//        return a+b;
//    }
//}

import java.util.function.BiFunction;

public class Sample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> mc = (a, b) -> a + b;
        int result = mc.apply(3, 4);
        System.out.println("result = " + result);
    }
}
