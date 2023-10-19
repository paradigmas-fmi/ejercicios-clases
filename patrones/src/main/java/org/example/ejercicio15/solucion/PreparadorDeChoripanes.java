package org.example.ejercicio15.solucion;

public class PreparadorDeChoripanes extends PreparadorDeSandwiches {
    @Override
    public void prepararSandwich() {
        super.prepararSandwich();
    }

    @Override
    protected void agregarPan() {
        System.out.println("Agregando pan frances");
    }
    @Override
    protected void agregarIngrediente() {
        System.out.println("Agregando chori");
    };
    @Override
    protected void agregarAdherezo() {
        System.out.println("Agregando chimi");
    };
}
