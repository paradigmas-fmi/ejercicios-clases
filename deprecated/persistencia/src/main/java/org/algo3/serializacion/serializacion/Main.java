package org.algo3.serializacion.serializacion;

import org.algo3.serializacion.Persona;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        Persona persona = new Persona("Mati", "Cano", 28);

        String path = "/some/path";

        FileOutputStream fos = new FileOutputStream(path);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(persona);
        oos.close();
    }
}

