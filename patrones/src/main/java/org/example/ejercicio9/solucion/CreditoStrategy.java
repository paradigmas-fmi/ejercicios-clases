package org.example.ejercicio9.solucion;

public class CreditoStrategy implements MetodoDePagoStrategy {
    public void pagar(Usuario usuario, Integer monto) {
        // TODO: Logica de ejecucion de pago con Tarjeta de Credito
        System.out.println("Ejecutando pago con Tarjeta de Credito");
    };
}
