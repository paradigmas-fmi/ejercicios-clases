package org.example.ejercicio7;

public class Multiplicacion extends Expresion {

    private int mult;

    public Multiplicacion(int mult) {
        this.mult = mult;
    }

    public Resultado resolver(int valor) {
        return new Resultado(valor*mult);
    }

}
