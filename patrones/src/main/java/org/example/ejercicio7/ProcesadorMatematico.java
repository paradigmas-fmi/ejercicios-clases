package org.example.ejercicio7;

import java.util.List;

public class ProcesadorMatematico {

    public int resolver(List<Expresion> expresiones, int valorInicial) {
        int resParcial = valorInicial;
        for (Expresion expresion : expresiones) {
            resParcial = expresion.resolver(resParcial).valor();
        }
        System.out.printf("%d\n", resParcial);
        return resParcial;
    }
}
