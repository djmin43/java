package org.example.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    boolean isOdd(int val) {
        return val % 2 != 0;
    }

    int avg(int[] intArray) {
        int sum = 0;
        for (Integer integer : intArray) {
            sum += integer;
        }
        return sum / intArray.length;
    }

    int avg(ArrayList<Integer> intArray) {
        int sum = 0;
        for (Integer integer : intArray) {
            sum += integer;
        }
        return sum / intArray.toArray().length;
    }
}

class UpgradeCalculator extends Calculator {
    void minus(int val) {
        this.value -= val;
    }
}

class MaxLimitCalculator extends Calculator {
    void add(int val) {
        this.value += val;
        if (this.value > 100) {
            this.value = 100;
        }
    }
}

public class Quiz {

    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9};
        Calculator cal = new Calculator();
        int result = cal.avg(data);
        System.out.println(result);  // 5 출력
    }
}
