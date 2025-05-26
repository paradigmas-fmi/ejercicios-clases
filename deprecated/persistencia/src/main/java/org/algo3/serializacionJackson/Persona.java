package org.algo3.serializacionJackson;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Persona {
    private String nombre;
    private String apellido;
    private Direccion direccion;

    @JsonCreator
    public Persona(@JsonProperty("nombre") String nombre, @JsonProperty("apellido") String apellido, @JsonProperty("direccion") Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
