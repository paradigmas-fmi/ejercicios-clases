package org.example.ejercicio7.inicial;

public class Multiplicacion extends Expresion {

    private int a;
    private int b;

    public Multiplicacion(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int resolver() {
        return a*b;
    }

}
