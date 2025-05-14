package org.example.ejercicio7.inicial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ProcesadorMatematico procesador = new ProcesadorMatematico();

        // Esta limitado, pues para armar operaciones mas complejos hay que crear operaciones mas grandes,
        // o armar alguna logica con listas para indicar operaciones
        Expresion suma = new Suma(10, 2);
        Expresion mult1 = new MultiplicacionDeSumas(1, 2, 4, 6);

        procesador.resolver(suma);
        procesador.resolver(mult1);
    }
}