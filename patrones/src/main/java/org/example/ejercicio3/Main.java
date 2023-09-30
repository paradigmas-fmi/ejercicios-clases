package org.example.ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PanConSemillas pan = new PanConSemillas();

        Mayonesa mayonesa = new Mayonesa();
        Ketchup ketchup = new Ketchup();

        Jamon jamon = new Jamon();
        Queso queso = new Queso();

        Lechuga lechuga = new Lechuga();
        Tomate tomate = new Tomate();

        Sandwich sandwich = new Sandwich(
                pan,
                new ArrayList<Verdura>(Arrays.asList(new Verdura[]{lechuga, tomate})),
                new ArrayList<Fiambre>(Arrays.asList(new Fiambre[]{jamon, queso})),
                new ArrayList<Aderezo>(Arrays.asList(new Aderezo[]{ketchup, mayonesa}))
        );
    }
}