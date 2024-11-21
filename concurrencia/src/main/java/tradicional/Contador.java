package tradicional.ej4contadorCondVars;

public class Contador {
    private int contador;

    public Contador() {
        this.contador = 0;
    }

    public synchronized int obtenerValor() {
        return contador;
    }

    public synchronized void incrementar() {
        contador += 1;
    }
}
