package org.algo3.serializacionJacksonCustom;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Direccion {
    private String calle;
    private String numero;
    private String ciudad;

    @JsonCreator
    public Direccion(
            @JsonProperty("calle") String calle,
            @JsonProperty("numero") String numero,
            @JsonProperty("ciudad") String ciudad
    ) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumero() {
        return numero;
    }

    public String getCiudad() {
        return ciudad;
    }
}
