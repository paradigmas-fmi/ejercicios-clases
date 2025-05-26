package org.algo3.serializacionJacksonCustom;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class PersonaSerializer extends StdSerializer<Persona> {

    public PersonaSerializer() {
        this(null);
    }

    public PersonaSerializer(Class<Persona> t) {
        super(t);
    }

    @Override
    public void serialize(
            Persona persona, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonProcessingException {

        jgen.writeStartObject();
        jgen.writeStringField("nombre", persona.getNombre());
        jgen.writeStringField("apellido", persona.getApellido());
        jgen.writeStringField("direccion_calle", persona.getDireccion().getCalle());
        jgen.writeStringField("direccion_numero", persona.getDireccion().getNumero());
        jgen.writeStringField("direccion_ciudad", persona.getDireccion().getCiudad());
        jgen.writeEndObject();
    }
}

