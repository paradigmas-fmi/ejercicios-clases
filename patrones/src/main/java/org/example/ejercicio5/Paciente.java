package org.example.ejercicio5;

public class Paciente {
    private boolean dolorDeCabeza;
    private boolean dolorDePanza;
    private boolean fatigaMuscular;
    private boolean vomitos;
    private boolean esAlergicoIbuprofeno;

    public Paciente(boolean dolorDeCabeza, boolean dolorDePanza, boolean fatigaMuscular, boolean vomitos, boolean esAlergicoIbuprofeno) {
        this.dolorDeCabeza = dolorDeCabeza;
        this.dolorDePanza = dolorDePanza;
        this.fatigaMuscular = fatigaMuscular;
        this.vomitos = vomitos;
        this.esAlergicoIbuprofeno = esAlergicoIbuprofeno;
    }

    public void curarDolorDeCabeza() {
        this.dolorDeCabeza = false;
    }

    public void curarDolorDePanza() {
        this.dolorDePanza = false;
    }

    public void curarFatigaMuscular() {
        this.fatigaMuscular = false;
    }

    public void curarVomitos() {
        this.vomitos = false;
    }

    public boolean tieneDolorDeCabeza() {
        return dolorDeCabeza;
    }
    public boolean tieneDolorDePanza() {
        return dolorDeCabeza;
    }
    public boolean tieneFatigaMuscular() {
        return dolorDeCabeza;
    }
    public boolean tieneVomitos() {
        return dolorDeCabeza;
    }
    public boolean esAlergicoIbuprofeno() {
        return esAlergicoIbuprofeno;
    }
}
