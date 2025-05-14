package org.example.ejercicio7.inicial;

import java.util.List;

public class ProcesadorMatematico {

    public int resolver(Expresion expresion) {
        int resultado = expresion.resolver();
        System.out.printf("%d\n", resultado);
        return resultado;
    }
}
