package org.algo3.serializacion.deserializacion;

import org.algo3.serializacion.Persona;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "/some/path";

        FileInputStream fis = new FileInputStream(path);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Persona persona = (Persona) ois.readObject();

        System.out.printf("%s %s %d\n", persona.nombre, persona.apellido, persona.edad);
    }
}
