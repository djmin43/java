package org.example.chapter1;

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        Integer input = stdIn.nextInt();

        int numberLength = input.toString().length();

        System.out.printf("그 수는 %d자리입니다.%n", numberLength);


    }
}
