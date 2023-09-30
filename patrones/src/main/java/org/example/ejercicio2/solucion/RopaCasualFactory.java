package org.example.ejercicio2.solucion;

public class RopaCasualFactory implements RopaFactory {
    @Override
    public Remera createRemera() {
        return new RemeraCasual();
    }

    @Override
    public Zapatillas createZapatillas() {
        return new ZapatillasCasuales();
    }

    @Override
    public Pantalones createPantalones() {
        return new PantalonesCasuales();
    }
}
