package org.example.ejercicio7;

public class Suma extends Expresion {

    private int sumando;

    public Suma(int sumando) {
        this.sumando = sumando;
    }

    public Resultado resolver(int valor) {
        return new Resultado(valor+sumando);
    }

}
