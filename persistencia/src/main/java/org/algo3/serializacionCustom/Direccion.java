package org.algo3.serializacionCustom;

import java.io.Serializable;

public class Direccion {
    private String calle;
    private String numero;
    private String ciudad;

    public Direccion(String calle, String numero, String ciudad) {
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
