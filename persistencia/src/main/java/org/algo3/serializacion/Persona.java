package org.algo3.serializacion;

import java.io.Serializable;

public class Persona implements Serializable {
    public String nombre;
    public String apellido;
    public Integer edad;

    public Persona(String nombre, String apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
}
