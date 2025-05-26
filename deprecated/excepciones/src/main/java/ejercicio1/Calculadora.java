package ejercicio1;

public class Calculadora {

    public double sumar(double x, double y) {
        return x + y;
    }

    public double multiplicar(double x, double y) {
        return x * y;
    }

    public double dividir(double divisor, double dividendo) {
        return divisor/dividendo;
    }

    public double raiz(double valor) {
        if (valor<0) {
            return -1;
        }
        return Math.sqrt(valor);
    }
}
