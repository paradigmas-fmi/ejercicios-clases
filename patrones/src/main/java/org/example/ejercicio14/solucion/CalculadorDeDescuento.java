package org.example.ejercicio14.solucion;

public class CalculadorDeDescuento {
    public void aplicarDescuento(Compra compra, Membresia membresia) {
        DescuentoPorMontoHandler descuentoPorMontoHandler = new DescuentoPorMontoHandler();
        DescuentoPorBlackHandler descuentoPorBlackHandler = new DescuentoPorBlackHandler();
        DescuentoPorGoldSilverHandler descuentoPorGoldSilverHandler = new DescuentoPorGoldSilverHandler();
        DescuentoDefaultHandler descuentoDefaultHandler = new DescuentoDefaultHandler();

        descuentoPorMontoHandler.setNextHandler(descuentoPorBlackHandler);
        descuentoPorBlackHandler.setNextHandler(descuentoPorGoldSilverHandler);
        descuentoPorGoldSilverHandler.setNextHandler(descuentoDefaultHandler);

        descuentoPorBlackHandler.aplicarDescuento(compra, membresia);
    }

}
