package org.algo3.inputStream;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String dir = "/some/path";
        FileInputStream fis = new FileInputStream(dir);
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream dis = new DataInputStream(bis);

        boolean finDeArchivo = false;
        while (!finDeArchivo) {
            try {
                int byteLeido = dis.readByte();
                System.out.printf("0x%02X\n", byteLeido);
            } catch (EOFException ex) {
                dis.close();
                finDeArchivo = true;
            }
        }
    }
}

