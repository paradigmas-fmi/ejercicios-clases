package org.algo3.serializacionJacksonCustom;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = PersonaSerializer.class)
@JsonDeserialize(using = PersonaDeserializer.class)
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
