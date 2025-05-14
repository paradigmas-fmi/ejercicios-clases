package org.example.ejercicio3.solucion;

public class SandwichBuilder {
    private Sandwich sandwich;

    public SandwichBuilder(Pan pan) {
        this.sandwich = new Sandwich(pan);
    }

    public SandwichBuilder cambiarPan(Pan pan) {
        sandwich.setPan(pan);
        return this;
    }

    public SandwichBuilder ponerVerdura(Verdura verdura) {
        sandwich.addVerdura(verdura);
        return this;
    }

    public SandwichBuilder ponerFiambre(Fiambre fiambre) {
        sandwich.addFiambre(fiambre);
        return this;
    }

    public SandwichBuilder ponerAderezo(Aderezo aderezo) {
        sandwich.addAderezo(aderezo);
        return this;
    }

    public Sandwich getSandwich() {
        return this.sandwich;
    }

}
