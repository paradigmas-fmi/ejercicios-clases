package ejercicio1.solucion.error;

public class DivisionPorCeroException extends MathException {
    public DivisionPorCeroException() {
        super("No se puede dividir por cero!");
    }
}
