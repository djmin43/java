package org.example.chapter2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        int[] randomArray = generateRandomArray(n);
        for (int i : randomArray) {
            System.out.print(" " + i + " ");
        }
        reverse(randomArray);
        System.out.println();
        System.out.println("역순 정렬을 마쳤습니다.");

        int sum = sumOf(randomArray);
        System.out.println("sum = " + sum);
    }

    private static int sumOf(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    private static void reverse(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length / 2; i++) {
            swap(array, i, array.length - i - 1);
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        System.out.println();
        System.out.printf("a[%d]과(와) a[%d]를 교환합니다.", index1, index2);
        System.out.println();
        int t = array[index1];
        array[index1] = array[index2];
        array[index2] = t;
        for (int i : array) {

            System.out.print(" " + i + " ");
        }
    }


    private static int[] generateRandomArray(int n) {
        int[] xArray = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            xArray[i] = random.nextInt(500);
        }
        return xArray;
    }

}
