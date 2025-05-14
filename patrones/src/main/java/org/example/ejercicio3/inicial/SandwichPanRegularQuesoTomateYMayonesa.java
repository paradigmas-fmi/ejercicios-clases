package org.example.ejercicio3.inicial;

import java.util.List;

public class SandwichPanRegularQuesoTomateYMayonesa extends Sandwich {
    public SandwichPanRegularQuesoTomateYMayonesa() {
        super();
        this.pan = new PanRegular();
        this.verduras = List.of(new Tomate());
        this.fiambres = List.of(new Queso());
        this.aderezos = List.of(new Mayonesa());
    }
}
