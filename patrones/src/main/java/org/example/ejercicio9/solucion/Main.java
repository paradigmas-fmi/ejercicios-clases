package org.example.ejercicio9.solucion;

public class Main {
    public static void main(String[] args) {

        CreditoStrategy creditoStrategy = new CreditoStrategy();

        ProcesadorDePagos procesadorDePagos = new ProcesadorDePagos(creditoStrategy);

        procesadorDePagos.ejecutarPago(new Usuario(), 1000);

        procesadorDePagos.setStrategy(new MercadopagoStrategy());

        System.out.println("Hello world!");
    }
}