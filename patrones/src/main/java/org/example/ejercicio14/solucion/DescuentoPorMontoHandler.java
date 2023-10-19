package org.example.ejercicio14.solucion;

public class DescuentoPorMontoHandler extends DescuentoHandler {
    public void aplicarDescuento(Compra compra, Membresia membresia) {
        Double costo = compra.getCosto();
        if (costo > 1000) {
            Double descuento = costo * 0.2;
            System.out.println("Descuento por monto");
            compra.setCosto(costo - descuento);
        } else if (this.nextHandler != null) {
            this.nextHandler.aplicarDescuento(compra, membresia);
        }
    };
}
