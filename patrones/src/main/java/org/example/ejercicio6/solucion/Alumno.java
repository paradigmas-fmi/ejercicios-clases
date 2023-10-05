package org.example.ejercicio6.solucion;

import java.util.List;

public class Alumno {

    private int padron;

    public Alumno(int padron) {
        this.padron = padron;
    }

    public void consultarFechas(AyudaFiuba centroDeAyuda) {
        centroDeAyuda.consultasFechas(padron, "Quiero saber...?");
    }
    public void consultarTramites(AyudaFiuba centroDeAyuda) {
        centroDeAyuda.consultasTramites(padron, "Quiero saber...?");
    }
    public void consultarTemaAdministrativo(AyudaFiuba centroDeAyuda) {
        centroDeAyuda.consultasAdministrativas(padron, "Quiero saber...?");
    }

}
