package org.example.ejercicio15.solucion;

public abstract class PreparadorDeSandwiches {
    public void prepararSandwich() {
        agregarPan();
        agregarIngrediente();
        agregarAdherezo();
        envolverSandwich();
    }

    protected abstract void agregarPan();

    protected abstract void agregarIngrediente();

    protected abstract void agregarAdherezo();

    protected void envolverSandwich() {
        System.out.println("Envolviendo un sandwich");
    }
}
