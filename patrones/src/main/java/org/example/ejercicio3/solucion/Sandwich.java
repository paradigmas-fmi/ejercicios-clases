package org.example.ejercicio3.solucion;

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

    public Sandwich() {

    }

    public void setPan(Pan pan) {
        this.pan = pan;
    }


    public void setFiambre(Fiambre fiambre) {
        this.fiambres.add(fiambre);
    }

    public void setAderezo(Aderezo aderezo) {
        this.aderezos.add(aderezo);
    }

    public void setVerdura(Verdura verdura) {
        this.verduras.add(verdura);
    }
}
