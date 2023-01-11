package org.example.simple;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankTransactionAnalyzerSimple {
    private static final String RESOURCES = "src/main/resources/bank-trnsactions.csv";

    public static void main(String[] args) throws IOException {
        final Path path = Paths.get(RESOURCES);
        String lines = Files.readAllLines(path).get(0);
        System.out.println("lines = " + lines);
//        double total = 0d;
//        for (final String line : lines) {
//            String[] columns = line.split(",");
//            double amount = Double.parseDouble(columns[1]);
//            total += amount;
//        }


    }
}
