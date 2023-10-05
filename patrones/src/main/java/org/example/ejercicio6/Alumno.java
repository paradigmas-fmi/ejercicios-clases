package org.example.ejercicio6;

import java.util.List;

public class Alumno {

    private int padron;

    public Alumno(int padron) {
        this.padron = padron;
    }

    public void consultarFechas(List<DeptoFiuba> posiblesDestinos) {
        for (DeptoFiuba destino : posiblesDestinos) {
            if (destino.consultar(this.padron, "Quiero saber...?")) {
                return;
            }
        }
    }

    public void consultarTramites(List<DeptoFiuba> posiblesDestinos) {
        for (DeptoFiuba destino : posiblesDestinos) {
            if (destino.consultar(this.padron, "Quiero saber...?")) {
                return;
            }
        }
    }

    public void consultarTemaAdministrativo(List<DeptoFiuba> posiblesDestinos) {
        for (DeptoFiuba destino : posiblesDestinos) {
            if (destino.consultar(this.padron, "Quiero saber...?")) {
                return;
            }
        }
    }

}
