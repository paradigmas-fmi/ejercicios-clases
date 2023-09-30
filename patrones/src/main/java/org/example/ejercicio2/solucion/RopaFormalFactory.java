package org.example.ejercicio2.solucion;

public class RopaFormalFactory implements RopaFactory {
    @Override
    public Remera createRemera() {
        return new RemeraFormales();
    }

    @Override
    public Zapatillas createZapatillas() {
        return new ZapatillasFormales();
    }

    @Override
    public Pantalones createPantalones() {
        return new PantalonesFormales();
    }
}
