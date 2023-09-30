package org.example.ejercicio3.solucion;

public class Main {
    public static void main(String[] args) {
        PanConSemillas pan = new PanConSemillas();

        Mayonesa mayonesa = new Mayonesa();
        Ketchup ketchup = new Ketchup();

        Jamon jamon = new Jamon();
        Queso queso = new Queso();

        Lechuga lechuga = new Lechuga();
        Tomate tomate = new Tomate();

        SandwichBuilder sandwichBuilder = new SandwichBuilder();

        Sandwich sandwich = sandwichBuilder
                .ponerPan(pan)
                .ponerFiambre(queso)
                .ponerFiambre(jamon)
                .ponerAderezo(ketchup)
                .ponerAderezo(mayonesa)
                .getSandwich();
    }
}