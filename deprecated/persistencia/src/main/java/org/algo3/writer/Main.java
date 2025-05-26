package org.algo3.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] strArray = { "mati", "nacho", "fede" };
        String path = "/some/path";

        FileWriter fw = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        PrintWriter pw2 = new PrintWriter(pw);

        for (String nombre : strArray) {
            pw.println(nombre);
        }

        pw.close();
    }
}
