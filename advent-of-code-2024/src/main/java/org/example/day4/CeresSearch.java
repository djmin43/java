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

public class CeresSearch {

    public static void main(String[] args) {

        Scanner scanner = TxtReader.scanner("ceres-search.txt");
        List<ArrayList<String>> list = CeresSearch.parse(scanner);
        System.out.println(list);
    }

    public static List<ArrayList<String>> parse(Scanner scanner) {
        List<ArrayList<String>> list = new ArrayList<>();

        while (scanner.hasNext()) {
            String[] splitLine = scanner.nextLine().split("");
            ArrayList<String> lineList = new ArrayList<>();
            for (String str : splitLine) {
                lineList.add(str);
            }
            list.add(lineList);
        }

        return list;
    }

}
