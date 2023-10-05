package org.example.ejercicio7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ProcesadorMatematico procesador = new ProcesadorMatematico();
        // Solucion debe darse curryficada, y aun asi no parece cubrir todos los casos (el de muchos terminos)
        Expresion suma1 = new Suma(1);
        Expresion suma2 = new Suma(2);
        Expresion mult1 = new Multiplicacion(3);

        procesador.resolver(Arrays.asList(suma1, suma2, mult1), 4);
    }
}