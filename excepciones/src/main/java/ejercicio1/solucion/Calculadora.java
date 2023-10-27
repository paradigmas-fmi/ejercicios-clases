package ejercicio1.solucion;

import ejercicio1.solucion.error.DivisionPorCeroException;
import ejercicio1.solucion.error.MathException;
import ejercicio1.solucion.error.RaizNegativaException;

public class Calculadora {

    public double sumar(double x, double y) {
        return x + y;
    }

    public double multiplicar(double x, double y) {
        return x * y;
    }

    public double dividir(double divisor, double dividendo) {
        if (dividendo == 0) {
            throw new DivisionPorCeroException();
        }
        return divisor/dividendo;
    }

    public double raiz(double valor) {
        if (valor<0) {
            throw new RaizNegativaException();
        }
        return Math.sqrt(valor);
    }
}
