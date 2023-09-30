package org.example.ejercicio2.solucion;

public class RopaDeportivaFactory implements RopaFactory {
    @Override
    public Remera createRemera() {
        return new RemeraDeportiva();
    }

    @Override
    public Zapatillas createZapatillas() {
        return new ZapatillasDeportivas();
    }

    @Override
    public Pantalones createPantalones() {
        return new PantalonesDeportivos();
    }
}
