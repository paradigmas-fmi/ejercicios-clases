package org.example.ejercicio2;

public class Persona {

    private Zapatillas zapatillas;
    private Pantalones pantalones;
    private Remera remera;

    public void vestirse(Estilo estilo) {
        if (estilo == Estilo.DEPORTIVO) {
            this.zapatillas = new ZapatillasDeportivas();
            this.pantalones = new PantalonesDeportivos();
            this.remera = new RemeraDeportiva();
        } else if (estilo == Estilo.CASUAL) {
            this.zapatillas = new ZapatillasCasuales();
            this.pantalones = new PantalonesCasuales();
            this.remera = new RemeraCasual();
        } else if (estilo == Estilo.FORMAL) {
            this.zapatillas = new ZapatillasFormales();
            this.pantalones = new PantalonesFormales();
            this.remera = new RemeraFormales();
        }
    }
}
