package org.example.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HistorianHysteria {

    public static void main(String[] args) {
        try {
            String path = System.getProperty("user.dir") + "/src/main/resources";

            Integer sum = 0;
            ArrayList<Integer> firstList = new ArrayList<>();
            ArrayList<Integer> secondList = new ArrayList<>();

            File myFile = new File(path + "/location-id.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String[] data = myReader.nextLine().split(" ", 4);
                firstList.add(Integer.parseInt(data[0]));
                secondList.add(Integer.parseInt(data[3]));
            }
            myReader.close();

            Collections.sort(firstList);
            Collections.sort(secondList);
            for (int i = 0; i < firstList.size(); i++) {
                sum += Math.abs(firstList.get(i) - secondList.get(i));
            }
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }


    }

}
