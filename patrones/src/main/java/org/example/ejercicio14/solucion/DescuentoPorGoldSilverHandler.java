package org.example.ejercicio14.solucion;

public class DescuentoPorGoldSilverHandler extends DescuentoHandler {
    public void aplicarDescuento(Compra compra, Membresia membresia) {
        Double costo = compra.getCosto();
        if (membresia == Membresia.SILVER || membresia == Membresia.GOLD) {
            Double descuento = costo * 0.10;
            System.out.println("Descuento por membresia");
            compra.setCosto(costo - descuento);
        } else if (this.nextHandler != null) {
            this.nextHandler.aplicarDescuento(compra, membresia);
        }
    };
}
