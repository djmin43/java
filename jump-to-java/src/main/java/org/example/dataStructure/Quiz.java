package org.example.dataStructure;

import java.util.*;

public class Quiz {

    public static void main(String[] args) {
        Last();

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

    static void Seven() {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String join = String.join(" ", myList);
        System.out.println("join = " + join);
    }

    static void Eight() {
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        grade.remove("B");
        System.out.println("grade = " + grade);
    }

    static void Nine() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet newNumbers = new HashSet(Arrays.asList(numbers.toArray()));
        System.out.println("newNumbers = " + newNumbers);

    }

    enum CoffeeEnum {
        AMERICANO,
        ICED_AMERICANO,
        CAFE_LATTE

    }

    static void printCoffeePrice(CoffeeEnum type) {
        HashMap<CoffeeEnum, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeEnum.AMERICANO, 3000);  // 1: 아메리카노
        priceMap.put(CoffeeEnum.ICED_AMERICANO, 4000);  // 2: 아이스 아메리카노
        priceMap.put(CoffeeEnum.CAFE_LATTE, 5000);  // 3: 카페라떼
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

    static void Last() {
        printCoffeePrice(CoffeeEnum.AMERICANO);
    }



}
