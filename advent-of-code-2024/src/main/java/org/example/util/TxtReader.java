package org.example.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TxtReader {

    public static Scanner scanner(String fileName) {
        String path = System.getProperty("user.dir") + "/src/main/resources";
        File myFile = new File(path + "/" + fileName);

        try {
            Scanner myReader = new Scanner(myFile);
            return myReader;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
