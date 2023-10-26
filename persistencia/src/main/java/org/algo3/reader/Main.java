package org.algo3.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "/some/path";
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        LineNumberReader lr = new LineNumberReader(br);

        String renglon;

        while ((renglon = lr.readLine()) != null) {
            System.out.println((lr.getLineNumber() + ") " + renglon));
        }
    }
}

