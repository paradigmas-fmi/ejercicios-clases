package org.example.ejercicio15.solucion;

public class PreparadorDeSandwichesJyQ extends PreparadorDeSandwiches {
    @Override
    public void prepararSandwich() {
        super.prepararSandwich();
    }

    @Override
    protected void agregarPan() {
        System.out.println("Agregando pan comun");
    }
    @Override
    protected void agregarIngrediente() {
        System.out.println("Agregando jamon y queso");
    };
    @Override
    protected void agregarAdherezo() {
        System.out.println("Agregando mayonesa");
    };
}
