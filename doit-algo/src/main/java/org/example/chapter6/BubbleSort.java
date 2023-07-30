package org.example.chapter6;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int[] ints = generateRandomArray(n);
        System.out.println();
        bubbleSort(ints);
    }

    private static int[] bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int exchange = 0;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j+1);
                    exchange++;
                }
            }
            if (exchange == 0) {
                break;
            }
        }

        for (int i : a) {
            System.out.print(i + " ");
        }

        return a;
    }

    private static void swap(int[] array, int a, int b) {
        int t = array[a];
        array[a] = array[b];
        array[b] = t;
    }

    private static int[] generateRandomArray(int n) {
        Random rand = new Random();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = rand.nextInt(1000);
        }
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
        return ints;
    }


}
