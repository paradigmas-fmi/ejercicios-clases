package org.example.ejercicio7.solucion;

public class Main {
    public static void main(String[] args) {
        ProcesadorMatematico procesador = new ProcesadorMatematico();
        // (3*4) + (3*9)
        Expresion mult1 = new Multiplicacion(new Resultado(3), new Resultado(4));
        Expresion mult2 = new Multiplicacion(new Resultado(3), new Resultado(9));
        Expresion suma = new Suma(mult1, mult2);

        procesador.resolver(suma);
    }
}