package org.example.ejercicio8.inicial;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TuristaDePaquetes {

    private Set<String> restaurantsVisitados;
    private Set<String> atraccionesVisitadas;

    public TuristaDePaquetes() {
        this.restaurantsVisitados = new HashSet<String>();
        this.atraccionesVisitadas = new HashSet<String>();
    }

    public List<String> obtenerPaquete(EmpaquetadorTuristico infoPaquetes) {
        List<String> paquete = infoPaquetes.obtenerPaquete();
        return paquete;
    }

}
