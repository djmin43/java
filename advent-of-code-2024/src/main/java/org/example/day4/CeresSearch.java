package org.example.day4;


// 1. horizontal (forward)
// 1.1 horizon (backward)
// 2. vertical (forward)
// 2.1 vertical (backward)
// 3.1 diagonal (forward, down)
// 3.2 diagonal (forward, up)
// 3.3 diagonal (backward, down)
// 3.4 diagonal (backward, up)


import org.example.util.TxtReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CeresSearch {

    final static String xmas = "XMAS";

    public static void main(String[] args) {

        Scanner scanner = TxtReader.scanner("ceres-search.txt");
        ArrayList<String> list = CeresSearch.parse(scanner);
        int partOne = CeresSearch.partOne(list);
        System.out.println(partOne);
    }

    public static int partOne(ArrayList<String> list) {

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            String currentList = list.get(i);

            // 1
            Pattern firstPattern = Pattern.compile("(?=XMAS)");
            Matcher firstMatcher = firstPattern.matcher(currentList);
            while (firstMatcher.find()) {
                sum++;
            }

            // 2
            Pattern secondPattern = Pattern.compile("(?=SAMX)");
            Matcher secondMatcher = secondPattern.matcher(currentList);
            while (secondMatcher.find()) {
                sum++;
            }

            // 3
            for (int j = 0; j < currentList.length(); j++) {
                System.out.println(currentList.charAt(j));

            }




        }

        return sum;


    }


    public static ArrayList<String> parse(Scanner scanner) {
        ArrayList<String> list = new ArrayList<>();

        while (scanner.hasNext()) {
            list.add(scanner.nextLine());
        }

        return list;
    }

}
