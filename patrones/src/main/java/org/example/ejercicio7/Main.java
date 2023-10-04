package org.example.ejercicio7;

import com.sun.tools.javac.util.List;

public class Main {
    public static void main(String[] args) {
        ProcesadorMatematico procesador = new ProcesadorMatematico();
        Expresion suma1 = new Suma(1);
        Expresion suma2 = new Suma(2);
        Expresion mult1 = new Multiplicacion(3);

        procesador.resolver(List.of(suma1, suma2, mult1), 4);
    }
}