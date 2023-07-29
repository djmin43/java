package org.example.chapter1;

public class Max {

    public static void main(String[] args) {
        int max4 = max4(10, 23, 350, 41);
        System.out.println("max4 = " + max4);

        int min3 = min3(1, 50, 2);
        System.out.println("min3 = " + min3);

        int min4 = min4(1, 50, 2, 0);
        System.out.println("min4 = " + min4);

    }

    private static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        return max;
    }

    public static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
    public static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }
        return min;
    }
}
