package org.example.day3;

import org.example.util.TxtReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MullItOver {

    public static void main(String[] args) {

        Scanner scanner = TxtReader.scanner("mul.txt");
        String programString = MullItOver.parseString(scanner);
        int partOne = MullItOver.partOne(programString);
        int partTwo = MullItOver.partTwo(programString);
//        System.out.println(partOne);
        System.out.println(partTwo);
    }

    public static int partOne(String codes) {
        Integer sum = 0;
        List<String> list = new ArrayList<>();
        Matcher matcher = Pattern.compile("mul\\(\\d{0,3},\\d{0,3}\\)").matcher(codes);
        while (matcher.find()) {
            list.add(matcher.group());
        }

        for (int i = 0; i < list.size(); i++) {
            String regex = "mul\\((\\d{0,3}),(\\d{0,3})\\)";
            Pattern pattern = Pattern.compile(regex);
            Matcher patternMatcher = pattern.matcher(list.get(i));
            int mul = 0;
            if (patternMatcher.find()) {
                int first = Integer.valueOf(patternMatcher.group(1));
                int second = Integer.valueOf(patternMatcher.group(2));
                mul = first * second;
            }
            sum += mul;
        }
        return sum;
    }

    public static int partTwo(String codes) {
        Integer sum = 0;
        List<String> list = new ArrayList<>();
        Matcher matcher = Pattern.compile("mul\\(\\d{0,3},\\d{0,3}\\)|do\\(\\)|don't\\(\\)").matcher(codes);
        while (matcher.find()) {
            list.add(matcher.group());
        }

        boolean condition = true;

        for (int i = 0; i < list.size(); i++) {
            String conditionRegex = "do\\(\\)|don't\\(\\)";
            Pattern conditionPattern = Pattern.compile(conditionRegex);

            Matcher conditionMatcher = conditionPattern.matcher(list.get(i));

            if (conditionMatcher.find()) {
                if (Objects.equals(conditionMatcher.group(), "don't()")) {
                    condition = false;
                } else if (Objects.equals(conditionMatcher.group(), "do()")) {
                    condition = true;
                }
            }

            System.out.println(condition);

            String regex = "mul\\((\\d{0,3}),(\\d{0,3})\\)";
            Pattern pattern = Pattern.compile(regex);
            Matcher patternMatcher = pattern.matcher(list.get(i));
            int mul = 0;
            if (condition && patternMatcher.find()) {
                int first = Integer.valueOf(patternMatcher.group(1));
                int second = Integer.valueOf(patternMatcher.group(2));
                mul = first * second;
            }
            sum += mul;
        }

        return sum;
    }


    public static String parseString(Scanner codes) {
        StringBuilder str = new StringBuilder();

        while (codes.hasNextLine()) {
            str.append(codes.nextLine());
        }
        return str.toString();
    }
}
