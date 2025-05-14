package org.example.ejercicio3.inicial;

import java.util.List;

public class SandwichPanConSemillasSalameYQueso extends Sandwich {
    public SandwichPanConSemillasSalameYQueso() {
        super();
        this.pan = new PanConSemillas();
        this.verduras = List.of();
        this.fiambres = List.of(new Salame(), new Queso());
        this.aderezos = List.of();
    }
}
