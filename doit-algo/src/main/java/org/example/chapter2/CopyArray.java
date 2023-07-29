package org.example.chapter2;

import java.util.Random;
import java.util.Scanner;

public class CopyArray {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int[] array = generateArray(n);
        int[] emptyArray = new int[n];

        copy(array, emptyArray);
        rcopy(array, emptyArray);



    }

    private static int[] generateArray(int n) {
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    private static void copy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        printArrays(a, b);
    }

    private static void printArrays(int[] a, int[] b) {
        System.out.print("original array = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("copied array = ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }

    private static void rcopy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[b.length - 1 - i] = a[i];
        }
        printArrays(a, b);

    }
}
