package org.example.more.quiz.functional;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        int[] array = Arrays.stream(numbers)
//                .filter((a) -> a % 2 == 1)
//                .map((a) -> a * 2)
//                .toArray();


        // to remove negatives
        int[] numbers = {1, -2, 3, -5, 8, -3};
        int[] positiveNumbers = Arrays.stream(numbers)
                .filter(a -> a >= 0)
                .toArray();

        for (int positiveNumber : positiveNumbers) {
            System.out.println("positiveNumber = " + positiveNumber);
        }

    }
}