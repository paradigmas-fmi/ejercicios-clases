package org.example.ejercicio5;

public class Calculadora {

    private Float potencia(Float n, Integer m) {
        Float result = 1.0f;
        for (int i = 0; i<m; i++) {
            result = result * n;
        }
        return result;
    }

    public Float cuadrado(Float n) {
        return potencia(n, 2);
    }
}
