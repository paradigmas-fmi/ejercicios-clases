package org.algo3.serializacionCustom.deserializacion;

import org.algo3.serializacionCustom.Persona;

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

        System.out.printf("%s %s %s %s %s\n", persona.nombre, persona.apellido, persona.direccion.getCalle(), persona.direccion.getNumero(), persona.direccion.getCiudad());
    }
}
