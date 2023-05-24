package org.example.dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Quiz {

    public static void main(String[] args) {
        Six();

    }

    static int One() {
        int literature = 90;
        int english = 75;
        int math = 55;
        return (literature + english + math) / 3;
    }

    static String Two() {
        Integer number = 13;
        return number % 2 == 0 ? "even" : "odd";
    }

    static String Three() {
        String socialNumber = "881120-1068234";
        String DOB = socialNumber.substring(0, 6);
        String UniqueNumber = socialNumber.substring(7);
        return UniqueNumber;
    }

    static String Four() {
        String pin = "881120-2068234";
        return pin.valueOf(pin.charAt(7));
    }

    static void Five() {
        String a = "a:b:c:d";
        String answer = a.replaceAll(":", "#");
        System.out.println("answer = " + answer);

    }

    static void Six() {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        myList.sort(Comparator.naturalOrder());
        System.out.println("myList = " + myList);
    }





}
