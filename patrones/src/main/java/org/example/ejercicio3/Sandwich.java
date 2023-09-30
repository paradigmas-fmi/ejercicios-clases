package org.example.ejercicio3;

import java.util.List;

public class Sandwich {
    private Pan pan;
    private List<Verdura> verduras;
    private List<Fiambre> fiambres;
    private List<Aderezo> aderezos;
    public Sandwich(Pan pan, List<Verdura> verduras, List<Fiambre> fiambres, List<Aderezo> aderezos) {
        this.pan = pan;
        this.verduras = verduras;
        this.fiambres = fiambres;
        this.aderezos = aderezos;
    }
}
