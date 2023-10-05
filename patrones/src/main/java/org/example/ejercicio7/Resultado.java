package org.example.ejercicio7;

public class Resultado extends Expresion {

    private int valor;

    public Resultado(int valor) {
        this.valor = valor;
    }

    public Resultado resolver(int valor) {
        return this;
    }

    public int valor() {
        return valor;
    }

}
