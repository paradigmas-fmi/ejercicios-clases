package org.algo3.serializacionCustom;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Persona implements Serializable {
    public String nombre;
    public String apellido;
    transient public Direccion direccion;

    public Persona(String nombre, String apellido, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(direccion.getCalle());
        oos.writeObject(direccion.getNumero());
        oos.writeObject(direccion.getCiudad());
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        String calle = (String) ois.readObject();
        String numero = (String) ois.readObject();
        String ciudad = (String) ois.readObject();
        this.direccion = new Direccion(calle, numero, ciudad);
    }
}
