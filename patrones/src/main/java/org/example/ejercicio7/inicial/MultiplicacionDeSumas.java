package org.example.ejercicio7.inicial;

public class MultiplicacionDeSumas extends Expresion {

    private Suma suma1;
    private Suma suma2;

    public MultiplicacionDeSumas(int a1, int a2, int b1, int b2) {
        this.suma1 = new Suma(a1, a2);
        this.suma2 = new Suma(b1, b2);
    }

    public int resolver() {
        return suma1.resolver() * suma2.resolver();
    }

}
