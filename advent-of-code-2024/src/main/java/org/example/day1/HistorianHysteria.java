package org.example.day1;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HistorianHysteria {

    public static void main(String[] args) {
        System.out.println("history hiysteria");
        try {
            String path = System.getProperty("user.dir")+ "/src/main/resources";

            File myFile = new File(path + "/location-id.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }





    }

}
