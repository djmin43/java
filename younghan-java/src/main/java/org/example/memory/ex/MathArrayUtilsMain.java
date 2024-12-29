package org.example.memory.ex;

import static org.example.memory.ex.MathArrayUtils.*;

public class MathArrayUtilsMain {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("sum = " + sum(values));
        System.out.println("average = " + average(values));
        System.out.println("min = " + min(values));
        System.out.println("max = " + max(values));
    }
}
