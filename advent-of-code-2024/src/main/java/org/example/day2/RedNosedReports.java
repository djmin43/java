package org.example.day2;

import org.example.util.TxtReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class RedNosedReports {

    public static void main(String[] args) {

        Scanner codes = TxtReader.scanner("red-nosed-reports.txt");
        List<ArrayList<Integer>> parsedRedNosedReports = RedNosedReports.parseRedNosedReports(codes);
        Integer partOne = RedNosedReports.partOne(parsedRedNosedReports);
        System.out.println(partOne);
    }


    public static Integer partOne(List<ArrayList<Integer>> reports) {
        Integer safeReports = 0;

        for (int i = 0; i < reports.size(); i++) {
            boolean isSafe = false;
            Integer firstCode = reports.get(i).get(0);
            Integer lastCode = reports.get(i).get(reports.get(i).size() - 1);
            boolean isAscending = firstCode < lastCode;

            if (firstCode.equals(lastCode)) {
                continue;
            }

            for (int j = 0; j < reports.get(i).size() - 1; j++) {
                Integer currentCode = reports.get(i).get(j);
                Integer nextCode = reports.get(i).get(j + 1);
                System.out.print(reports.get(i).get(j) + " ");

                if (isAscending) {
                    if (currentCode >= nextCode) {
                        continue;
                    }
                    if (Math.abs(currentCode - nextCode) > 3) {
                        continue;
                    }
                    isSafe = true;
                } else {
                    if (currentCode <= nextCode) {
                        continue;
                    }
                    if (Math.abs(currentCode - nextCode) > 3) {
                        continue;
                    }
                    isSafe = true;
                }

            }
            System.out.println(isSafe);

            if (isSafe) {
                safeReports++;
            }
        }
        return safeReports;

    }


    public static List<ArrayList<Integer>> parseRedNosedReports(Scanner codes) {
        ArrayList<ArrayList<Integer>> codeList = new ArrayList<>();

        while (codes.hasNext()) {
            String code = codes.nextLine();
            ArrayList<Integer> codeArrayList = new ArrayList<>();
            for (String s : code.split(" ")) {
                codeArrayList.add(Integer.parseInt(s));
            }
            codeList.add(codeArrayList);
        }

        return codeList;
    }
}
