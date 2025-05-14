package org.example.ejercicio9.inicial;

public class ProcesadorDePagos {


    public void executePayment(TipoDePago tipo, Usuario usuario, Integer monto) {
        if (tipo == TipoDePago.MERCADO_PAGO) {
            // TODO: Logica de ejecucion de pago con Mercado Pago
            System.out.println("Ejecutando pago con Mercado Pago");
        } else if (tipo == TipoDePago.TARJETA_DE_CREDITO) {
            // TODO: Logica de ejecucion de pago con Tarjeta de Credito
            System.out.println("Ejecutando pago con Tarjeta de Credito");
        } else if (tipo == TipoDePago.TARJETA_DE_DEBITO) {
            // TODO: Logica de ejecucion de pago con Tarjeta de Debito
            System.out.println("Ejecutando pago con Tarjeta de Debito");
        }
    }
}
