package org.example.ejercicio14;

public class CalculadorDeDescuento {
    public Double calcularDescuento(Double montoTotal, Membresia membresia) {
        Double descuento = 0.0;
        if (montoTotal > 1000) {
            descuento = montoTotal * 0.2;
            System.out.println("Descuento del Viernes Negro Aplicado");
        } else if (membresia == Membresia.BLACK) {
            descuento = montoTotal * 0.15;
            System.out.println("Descuento de Lealtad Aplicado");
        } else if (membresia == Membresia.GOLD || membresia == Membresia.SILVER) {
            descuento = montoTotal * 0.1;
            System.out.println("Descuento de Membresía Aplicado");
        } else {
            System.out.println("No se Aplicó Descuento");
        }
        return descuento;
    }

}
