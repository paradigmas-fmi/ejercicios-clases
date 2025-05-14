package org.example.ejercicio7.inicial;

public class Suma extends Expresion {

    private int a;
    private int b;

    public Suma(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int resolver() {
        return a+b;
    }

}
