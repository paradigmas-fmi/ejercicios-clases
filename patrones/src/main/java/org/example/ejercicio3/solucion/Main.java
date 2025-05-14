package org.example.ejercicio3.solucion;

public class Main {
    public static void main(String[] args) {
        Pan panSemillas = new PanConSemillas();
        Pan panRegular = new PanRegular();

        Aderezo mayonesa = new Mayonesa();
        Fiambre salame = new Salame();
        Fiambre queso = new Queso();

        Sandwich sandwichQuesoYTomate = new SandwichBuilder(panSemillas)
                .ponerVerdura(new Tomate())
                .ponerFiambre(queso)
                .ponerAderezo(mayonesa)
                .getSandwich();

        // Se deja a medio a hacer tambien
        SandwichBuilder sandwichSalameYQuesoBuilder = new SandwichBuilder(panRegular)
                .ponerFiambre(queso);

        Sandwich sandwichSalameYQueso = sandwichSalameYQuesoBuilder.ponerFiambre(salame).getSandwich();

    }
}