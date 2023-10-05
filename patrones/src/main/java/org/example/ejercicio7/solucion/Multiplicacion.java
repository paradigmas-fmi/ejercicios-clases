package org.example.ejercicio7.solucion;

public class Multiplicacion extends Expresion {

    private Expresion a;
    private Expresion b;

    public Multiplicacion(Expresion a, Expresion b) {
        this.a = a;
        this.b = b;
    }

    public Resultado resolver() {
        return new Resultado(a.resolver().valor() * b.resolver().valor());
    }

}
