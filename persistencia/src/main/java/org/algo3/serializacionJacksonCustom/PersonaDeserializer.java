package org.algo3.serializacionJacksonCustom;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class PersonaDeserializer extends StdDeserializer<Persona> {

    public PersonaDeserializer() {
        this(null);
    }

    public PersonaDeserializer(Class<Persona> t) {
        super(t);
    }

    @Override
    public Persona deserialize(JsonParser parser, DeserializationContext deserializer) throws IOException {

        ObjectCodec codec = parser.getCodec();
        JsonNode node = codec.readTree(parser);

        String nombre = node.get("nombre").asText();
        String apellido = node.get("apellido").asText();
        String direccion_calle = node.get("direccion_calle").asText();
        String direccion_numero = node.get("direccion_numero").asText();
        String direccion_ciudad = node.get("direccion_ciudad").asText();

        Direccion direccion = new Direccion(direccion_calle, direccion_numero, direccion_ciudad);
        Persona persona = new Persona(nombre, apellido, direccion);

        return persona;
    }
}

