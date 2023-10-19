package org.example.ejercicio14.solucion;

public class DescuentoPorBlackHandler extends DescuentoHandler {
    public void aplicarDescuento(Compra compra, Membresia membresia) {
        Double costo = compra.getCosto();
        if (membresia == Membresia.BLACK) {
            Double descuento = costo * 0.15;
            System.out.println("Descuento por black");
            compra.setCosto(costo - descuento);
        } else if (this.nextHandler != null) {
            this.nextHandler.aplicarDescuento(compra, membresia);
        }
    };
}
