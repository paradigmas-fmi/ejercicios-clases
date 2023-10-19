package org.example.ejercicio14.solucion;

public class DescuentoDefaultHandler extends DescuentoHandler {
    public void aplicarDescuento(Compra compra, Membresia membresia) {
        System.out.println("No se Aplicó Descuento");
    };
}
