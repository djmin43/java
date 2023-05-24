package org.example.controls;

public class Quiz {

    public static void main(String[] args) {
        System.out.println("helo");
        two();
        three();
        four();
        five();
    }

    static void one() {
        // answer should be everywhere because it has no everywhere
        String a = "write once, run anywhere";
        if (a.contains("wife")) {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
        }
    }

    static void two() {
        int sum = 0;
        int start = 1;
        while (start <= 1000) {
            if (start % 3 == 0) {
                sum = sum + start;
            }
            start++;
        }
        System.out.println("sum = " + sum);
        // answer = 166833
    }

    static void three() {
        for (int i = 0; i < 7; i++) {
            String stars = "*".repeat(i);
            System.out.println(stars);
        }
    }

    static void four() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }

    static void five() {
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int total = 0;
        for (int mark : marks) {
            total = total + mark;
        }
        System.out.println("average = " + (total / marks.length));
    }
}
