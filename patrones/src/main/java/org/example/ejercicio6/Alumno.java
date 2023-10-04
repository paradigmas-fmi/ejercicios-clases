package org.example.ejercicio6;

import java.util.List;

public class Alumno {

    private int padron;

    public Alumno(int padron) {
        this.padron = padron;
    }

    public boolean consultar(List<DeptoFiuba> posiblesDestinos, String consulta) {
        for (DeptoFiuba destino : posiblesDestinos) {
            if (destino.consultar(this.padron, consulta)) {
                return true;
            }
        }
        return false;
    }

}
