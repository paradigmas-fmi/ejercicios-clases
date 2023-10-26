package org.algo3.serializacionCustom.serializacion;

import org.algo3.serializacionCustom.Direccion;
import org.algo3.serializacionCustom.Persona;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        Direccion direccion = new Direccion("Paseo Colon", "850", "CABA");
        Persona persona = new Persona("Mati", "Cano", direccion);

        String path = "/some/path";

        FileOutputStream fos = new FileOutputStream(path);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(persona);
        oos.close();
    }
}

