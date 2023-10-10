package org.example.ejercicio9.solucion;

public class ProcesadorDePagos {
    private MetodoDePagoStrategy strategy;

    // Command
    // Strategy
    public ProcesadorDePagos(MetodoDePagoStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(MetodoDePagoStrategy strategy) {
        this.strategy = strategy;
    }

    public void ejecutarPago(Usuario usuario, Integer monto) {
        strategy.pagar(usuario, monto);
    }
}
