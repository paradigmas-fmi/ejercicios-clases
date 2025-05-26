package ejercicio1.solucion.error;

public class RaizNegativaException extends MathException {
    public RaizNegativaException() {
        super("No se puede calcular una raiz negativa!");
    }
}
