package org.example.day2;

import org.example.util.TxtReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RedNosedReports {

    public static void main(String[] args) {

        Scanner codes = TxtReader.scanner("red-nosed-reports.txt");
        List<ArrayList<Integer>> parsedRedNosedReports = RedNosedReports.parseRedNosedReports(codes);
        Integer partOne = RedNosedReports.partOne(parsedRedNosedReports);
        Integer partTwo = RedNosedReports.partTwo(parsedRedNosedReports);

        System.out.println(partOne);
        System.out.println(partTwo);
    }


    public static Integer partOne(List<ArrayList<Integer>> reports) {
        Integer safeReports = 0;

        for (int i = 0; i < reports.size(); i++) {
            boolean isSafe = validator(reports.get(i)) == -1;

            if (isSafe) {
                safeReports++;
            }
        }
        return safeReports;

    }

    public static Integer partTwo(List<ArrayList<Integer>> reports) {
        Integer safeReports = 0;
        for (int i = 0; i < reports.size(); i++) {
            boolean isSafe = true;
            int issueLayerIndex = validator(reports.get(i));

            if (issueLayerIndex != -1) {
                ArrayList<Integer> temp = reports.get(i);
                temp.remove(validator(temp));
                if (validator(temp) == -1) {
                    isSafe = true;
                } else {
                    isSafe = false;
                }
            }

            if (isSafe) {
                safeReports++;

            }
        }
        return safeReports;

    }

    public static int validator(ArrayList<Integer> currentReport) {

        int unsafeIndex = -1;
        Integer firstCode = currentReport.get(0);
        Integer lastCode = currentReport.get(currentReport.size() - 1);
        boolean isAscending = firstCode < lastCode;

        for (int j = 0; j < currentReport.size() - 1; j++) {
            Integer currentCode = currentReport.get(j);
            Integer nextCode = currentReport.get(j + 1);

            if (isAscending) {
                if (currentCode >= nextCode) {
                    unsafeIndex = j + 1;
                    break;
                }
                if (Math.abs(currentCode - nextCode) > 3) {
                    unsafeIndex = j + 1;
                    break;
                }
            } else {
                if (currentCode <= nextCode) {
                    unsafeIndex = j + 1;
                    break;
                }
                if (Math.abs(currentCode - nextCode) > 3) {
                    unsafeIndex = j + 1;
                    break;
                }
            }
        }

        return unsafeIndex;

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
