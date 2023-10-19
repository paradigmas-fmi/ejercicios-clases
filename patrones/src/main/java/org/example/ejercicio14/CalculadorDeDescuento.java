package org.example.ejercicio14;

public class CalculadorDeDescuento {
    public void aplicarDescuento(Compra compra, Membresia membresia) {
        Double descuento = 0.0;
        Double costo = compra.getCosto();
        if (costo > 1000) {
            descuento = costo * 0.2;
            System.out.println("Descuento por monto");
        } else if (membresia == Membresia.BLACK) {
            descuento = costo * 0.15;
            System.out.println("Descuento por black");
        } else if (membresia == Membresia.GOLD || membresia == Membresia.SILVER) {
            descuento = costo * 0.1;
            System.out.println("Descuento por membresia");
        } else {
            System.out.println("No se Aplicó Descuento");
        }
        compra.setCosto(costo - descuento);
    }

}
