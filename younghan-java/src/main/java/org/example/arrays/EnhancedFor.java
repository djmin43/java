package org.example.arrays;

public class EnhancedFor {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        for (int number : numbers) {

        }

        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
