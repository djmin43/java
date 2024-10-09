package org.example.templetemethod;

import java.util.Arrays;

public class DuckSortTestDrive {

    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("A", 8),
                new Duck("B", 1),
                new Duck("C", 899),
                new Duck("D", 81),
        };

        System.out.println("before sort");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\n after sort");
        display(ducks);
    }

    public static void display(Duck[] ducks) {
        for (Duck d : ducks) {
            System.out.println(d + ", ");
        }

    }
}
