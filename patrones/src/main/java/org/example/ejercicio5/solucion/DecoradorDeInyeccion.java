package org.example.ejercicio5.solucion;

public abstract class DecoradorDeInyeccion implements Inyeccion {

    protected Inyeccion aplicadoA;

    public DecoradorDeInyeccion añadirA(Inyeccion inyeccion) {
        aplicadoA = inyeccion;
        return this;
    }

}
