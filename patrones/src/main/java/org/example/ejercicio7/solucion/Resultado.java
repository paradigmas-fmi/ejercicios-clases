package org.example.ejercicio7.solucion;

public class Resultado extends Expresion {

    private int valor;

    public Resultado(int valor) {
        this.valor = valor;
    }

    public Resultado resolver() {
        return this;
    }

    public int valor() {
        return valor;
    }

}
