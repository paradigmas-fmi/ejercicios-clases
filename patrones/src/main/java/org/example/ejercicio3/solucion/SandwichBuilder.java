package org.example.ejercicio3.solucion;

public class SandwichBuilder {
    private Sandwich sandwich;

    public SandwichBuilder() {
        this.sandwich = new Sandwich();
    }

    public SandwichBuilder ponerPan(Pan pan) {
        sandwich.setPan(pan);
        return this;
    }

    public SandwichBuilder ponerFiambre(Fiambre fiambre) {
        sandwich.setFiambre(fiambre);
        return this;
    }

    public SandwichBuilder ponerAderezo(Aderezo aderezo) {
        sandwich.setAderezo(aderezo);
        return this;
    }

    public Sandwich getSandwich() {
        return this.sandwich;
    }



}
