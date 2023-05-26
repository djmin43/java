package org.example.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;

class Calculator {
    Integer value;

    Calculator() {
        this.value = 0;
    }


    void add(int val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
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
        Calculator cal = new Calculator();
        cal.add(3);
        System.out.println(cal.getValue());
    }
}
