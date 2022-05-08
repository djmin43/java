package com.mindongjoon;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class Main {
    public static void main (String[] args) {
        String result = NumberFormat.getPercentInstance().format(0.3);
        System.out.println(result);
    }
}
