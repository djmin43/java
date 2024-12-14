package org.example.day1;

import org.example.util.TxtReader;

import java.util.*;

public class HistorianHysteria {

    public static void main(String[] args) {
        Integer partOneAnswer = HistorianHysteria.partOne();
        Integer partTwoAnswer = HistorianHysteria.partTwo();
        System.out.println(partOneAnswer);
        System.out.println(partTwoAnswer);
    }

    public static Integer partOne() {
        ArrayList<ArrayList<Integer>> list = HistorianHysteria.readFile();
        ArrayList<Integer> firstList = list.get(0);
        ArrayList<Integer> secondList = list.get(1);

        Integer sum = 0;

        Collections.sort(firstList);
        Collections.sort(secondList);
        for (int i = 0; i < firstList.size(); i++) {
            sum += Math.abs(firstList.get(i) - secondList.get(i));
        }

        return sum;
    }

    public static Integer partTwo() {
        Integer score = 0;
        ArrayList<ArrayList<Integer>> list = HistorianHysteria.readFile();
        ArrayList<Integer> firstList = list.get(0);
        ArrayList<Integer> secondList = list.get(1);

        Map<Integer, Integer> scoreList = new HashMap<Integer, Integer>();

        secondList.forEach(s -> scoreList.put(s, scoreList.getOrDefault(s, 0) + 1));


        for (int i = 0; i < firstList.size(); i++) {
            if (scoreList.containsKey(firstList.get(i))) {
                score += firstList.get(i) * scoreList.get(firstList.get(i));
            }
        }

        return score;
    }


    public static ArrayList<ArrayList<Integer>> readFile() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> secondList = new ArrayList<>();

        Scanner myReader = TxtReader.scanner("location-id.txt");
        while (myReader.hasNextLine()) {
            String[] data = myReader.nextLine().split(" ", 4);
            firstList.add(Integer.parseInt(data[0]));
            secondList.add(Integer.parseInt(data[3]));
        }
        myReader.close();

        list.add(firstList);
        list.add(secondList);

        return list;
    }

}
