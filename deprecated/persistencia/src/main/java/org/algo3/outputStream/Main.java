package org.algo3.outputStream;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] initialArray = { 0x0a, 0x10, 0x1f };

        String path = "/some/path";
        FileOutputStream fos = new FileOutputStream(path);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(bos);

        for (byte b : initialArray) {
            dos.writeLong(b);
        }

        dos.close();
    }
}

