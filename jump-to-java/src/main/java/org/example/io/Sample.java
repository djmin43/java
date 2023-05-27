package org.example.io;

import java.io.IOException;
import java.io.InputStream;

public class Sample {

    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        int a;
        int b;
        int c;
        a = in.read();
        b = in.read();
        c = in.read();


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
