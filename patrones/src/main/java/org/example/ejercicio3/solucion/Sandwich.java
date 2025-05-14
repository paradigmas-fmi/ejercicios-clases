package org.example.ejercicio3.solucion;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private Pan pan;
    private List<Verdura> verduras;
    private List<Fiambre> fiambres;
    private List<Aderezo> aderezos;

    public Sandwich(Pan pan) {
        this.pan = pan;
        this.verduras = new ArrayList<>();
        this.fiambres = new ArrayList<>();
        this.aderezos = new ArrayList<>();
    }

    public void setPan(Pan pan) {
        this.pan = pan;
    }

    public void addFiambre(Fiambre fiambre) {
        this.fiambres.add(fiambre);
    }

    public void addAderezo(Aderezo aderezo) {
        this.aderezos.add(aderezo);
    }

    public void addVerdura(Verdura verdura) {
        this.verduras.add(verdura);
    }
}
