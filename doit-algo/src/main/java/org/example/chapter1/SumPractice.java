package org.example.chapter1;

import java.util.Scanner;

public class SumPractice {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int input = stdIn.nextInt();
        sumAll(input);
        gaussSum(input);
        sumOf(1, input);
    }

    private static void sumOf(int a, int b) {
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);


    }

    private static void gaussSum(int n) {
        int sum = n * (n + 1) / 2;
        System.out.println("gauss sum = " + sum);
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
