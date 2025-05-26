package ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        List<Function<Double, Double>> operaciones = Arrays.asList(
                x -> calculadora.sumar(x, 2),
                x -> calculadora.multiplicar(x, 3),
                x -> calculadora.dividir(x, 0),
                x -> calculadora.multiplicar(x, -1),
                x -> calculadora.raiz(x)
        );

        double res = 2;
        for (Function<Double, Double> fn : operaciones) {
            try {
                res = fn.apply(res);
                System.out.printf("Valor luego de operar -> %f \n", res);
            } catch (Exception e) {
                System.out.println("Error ejecutando operacion!");
            }
        }
    }
}