package org.example.chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class NestedLoop {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int input = stdIn.nextInt();

//        multiplicationTable(input);
        triangleLB(input);
        triangleLU(input);
        triangleRU(input);
        triangleRB(input);
    }

    //  왼쪽 위가 직각인 이등변 삼각형을 출력
    private static void triangleLU(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = (n - i); j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 오른쪽 위가 직각인 이등변 삼각형을 출력
    private static void triangleRU(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    // 오른쪽 아래가 직각인 이등변 삼각형을 출력
    private static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


    // 왼쪽 아래가 직각인 이등변 삼각형을 출력
    private static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void multiplicationTable(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d", i * j);
            }
        }
        System.out.println();
    }
}
