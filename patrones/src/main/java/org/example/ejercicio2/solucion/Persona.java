package org.example.ejercicio2.solucion;

public class Persona {

    private Zapatillas zapatillas;
    private Pantalones pantalones;
    private Remera remera;

    public void vestirse(RopaFactory factory) {
        this.zapatillas = factory.createZapatillas();
        this.pantalones = factory.createPantalones();
        this.remera = factory.createRemera();
    }
}
