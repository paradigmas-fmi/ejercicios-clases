package org.example.ejercicio14.solucion;

public abstract class DescuentoHandler {
    protected DescuentoHandler nextHandler;

    public void setNextHandler(DescuentoHandler handler) {
        this.nextHandler = handler;
    }

    public abstract void aplicarDescuento(Compra compra, Membresia membresia);
}
