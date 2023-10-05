package org.example.ejercicio7.solucion;

public class ProcesadorMatematico {

    public int resolver(Expresion expresion) {
        Resultado res = expresion.resolver();
        System.out.printf("%d\n", res.valor());
        return res.valor();
    }
}
