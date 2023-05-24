package org.example.dataStructure;

public class Quiz {

    public static void main(String[] args) {
        System.out.println(One());
        System.out.println(Two());
        System.out.println(Three());

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




}
