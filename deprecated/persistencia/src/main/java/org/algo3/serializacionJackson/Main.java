package org.algo3.serializacionJackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "/some/path";

        Direccion direccion = new Direccion("Paseo Colon", "850", "CABA");
        Persona persona = new Persona("Mati", "Cano", direccion);

        ObjectMapper objectMapper = new ObjectMapper();

        // Serializacion
        objectMapper.writeValue(new File(path), persona);

        // Deserializacion
        Persona p = objectMapper.readValue(new File(path), Persona.class);
        System.out.printf("%s %s %s %s %s\n", p.getNombre(), p.getApellido(), p.getDireccion().getCalle(), p.getDireccion().getNumero(), p.getDireccion().getCiudad());
    }
}
