package org.example.ejercicio5.solucion;

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
        return dolorDePanza;
    }
    public boolean tieneFatigaMuscular() {
        return fatigaMuscular;
    }
    public boolean tieneVomitos() {
        return vomitos;
    }
    public boolean esAlergicoIbuprofeno() {
        return esAlergicoIbuprofeno;
    }

    public String estado() {
        if (!dolorDePanza && !dolorDeCabeza && !fatigaMuscular && !vomitos) {
            return "Estoy 10 puntos!";
        }

        String estado = "Tengo... \n";
        if (dolorDeCabeza) estado+="dolor de cabeza...\n";
        if (dolorDePanza) estado+="dolor de panza...\n";
        if (fatigaMuscular) estado+="dolor en el cuerpo...\n";
        if (vomitos) estado+="vomitos :(( ...\n";
        return estado;
    }
}
