package org.example.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) throws IOException {
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        int c;
        try {

            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(System.getProperty("user.dir") + "/src/main/java/org/example/decorator/test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.println((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
