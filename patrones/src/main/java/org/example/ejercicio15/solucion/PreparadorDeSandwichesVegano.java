package org.example.ejercicio15.solucion;

public class PreparadorDeSandwichesVegano extends PreparadorDeSandwiches {
    @Override
    public void prepararSandwich() {
        super.prepararSandwich();
    }

    @Override
    protected void agregarPan() {
        System.out.println("Agregando pan vegano");
    }
    @Override
    protected void agregarIngrediente() {
        System.out.println("Agregando vegetales");
    };
    @Override
    protected void agregarAdherezo() {
        System.out.println("Agregando alioli");
    };
}
