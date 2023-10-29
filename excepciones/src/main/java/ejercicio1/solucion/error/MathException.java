package ejercicio1.solucion.error;

public class MathException extends RuntimeException {
    public MathException(String mensaje) {
        super(mensaje);
    }
}
