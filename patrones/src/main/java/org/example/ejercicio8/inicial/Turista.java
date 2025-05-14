package org.example.ejercicio8.inicial;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Turista {

    private Set<String> restaurantsVisitados;
    private Set<String> atraccionesVisitadas;

    public Turista() {
        this.restaurantsVisitados = new HashSet<String>();
        this.atraccionesVisitadas = new HashSet<String>();
    }

    public String elegirLugarParaComer(InformacionTuristica centroInformacion) {
        List<String> lugares = centroInformacion.gastronomiaRecomendada();
        int eleccion = 0;
        String lugar = lugares.get(eleccion);
        while (restaurantsVisitados.contains(lugar)) {
            eleccion++;
            lugar = lugares.get(eleccion);
        }
        restaurantsVisitados.add(lugar);
        return lugar;
    }

    public String elegirDestino(InformacionTuristica centroInformacion) {
        List<String> lugares = centroInformacion.obtenerAtracciones();
        int eleccion = 0;
        String lugar = lugares.get(eleccion);
        while (atraccionesVisitadas.contains(lugar)) {
            eleccion++;
            lugar = lugares.get(eleccion);
        }
        atraccionesVisitadas.add(lugar);
        return lugar;
    }

}
