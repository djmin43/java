package org.example.chapter3;

public class Search {

    public static void main(String[] args) {
        int[] a = {1, 9, 2, 9, 4, 6, 7, 9};
        int n = a.length;
        int key = 9;
        int[] idx = new int[n];
        int[] o = {1, 3, 5, 7, 8, 9, 10, 13, 15, 16, 20, 20, 20, 20, 20, 25, 300};

        int sum = searchIdx(a, n, key, idx);
        int binary = binarySearchX(o, 20);
        System.out.println("binary = " + binary + "; key = " + o[binary]);

    }

    private static int binarySearchX(int[] o, int key) {
        int pl = 0;
        int pr = o.length - 1;
        int index = 0;

        while (pl <= pr) {
            int pc = (pr + pl) / 2;
            if (o[pc] < key) {
                pl = pc + 1;
            }
            if (o[pc] > key) {
                pr = pc - 1;
            }
            if (o[pc] == key) {
                index = pc;
                break;
            }
        }

        while (o[index - 1] == key) {
            index--;
        }
        return index;

    }


    private static int searchIdx(int[] a, int n, int key, int[] idx) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                sum++;
                idx[i] = a[i];
            }
        }
        return sum;
    }

}
