package org.example.chapter2;

public class DayOfYear {

    public static void main(String[] args) {
        System.out.println(leftDayOfYear(2023, 12, 31));

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

        for(int i = 1; i < m; i++){
            days += mdays[isLeap(y)][i - 1];
        }
        return days;
    }

    static int leftDayOfYear(int y, int m, int d) {
        int days = d;
        int totalDays = 0;
        for(int i = 0; i < mdays[isLeap(y)].length; i++) {
            totalDays += mdays[isLeap(y)][i];
        }

        for (int j = 1; j < m; j++) {
            days += mdays[isLeap(y)][j - 1];
        }

        System.out.println(days);
        System.out.println(totalDays);

        return totalDays - days;
    }
}
