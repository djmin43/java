package org.example.chapter1;

import java.util.Scanner;

public class SumPractice {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int input = stdIn.nextInt();

        sumAll(input);

    }

    private static void sumAll(int input) {

        int sum = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= input; i++) {
            sum += i;
            sb.append(" ").append(i).append(" ");

            if (i < input) {
                sb.append("+");
            }
        }

        sb.append("= ").append(sum);

        String finalString = sb.toString();

        System.out.println(finalString);
    }
}
