package org.example.chapter2;

public class DayOfYear {

    public static void main(String[] args) {
        System.out.println(dayOfYear(2023, 10, 16));

    }

    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && (year & 100) != 0 || year % 400 == 0) ? 1 : 0;
    }

    static int dayOfYear(int y, int m, int d) {
        int days = d;

        for (int i = 1; i < m; i++){
            days += mdays[isLeap(y)][i - 1];
        }
        return days;
    }
}
