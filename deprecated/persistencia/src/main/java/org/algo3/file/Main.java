package org.algo3.file;

import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String dir = "/some/path";
        File path = new File(dir);
        if (path.isDirectory()) {
            System.out.println(path.getName());
            Arrays.stream(path.listFiles())
                    .forEach(p -> System.out.println(p.getName()));
        } else if (path.isFile()) {
            System.out.println(path.getName());
            System.out.println(path.length());
        }
    }
}

