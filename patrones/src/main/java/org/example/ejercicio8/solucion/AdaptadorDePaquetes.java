package org.example.ejercicio8.solucion;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AdaptadorDePaquetes implements EmpaquetadorTuristico {

    private InformacionTuristica centroInfo;

    public AdaptadorDePaquetes(InformacionTuristica centroInfo) {
        this.centroInfo = centroInfo;
    }

    public List<String> obtenerPaquete() {
        List<String> lugaresComida = centroInfo.gastronomiaRecomendada();
        List<String> atracciones = centroInfo.obtenerAtracciones();

        Random randomizer = new Random();
        String lugarComidaRandom = lugaresComida.get(randomizer.nextInt(lugaresComida.size()));
        String atraccionRandom = atracciones.get(randomizer.nextInt(atracciones.size()));

        return Arrays.asList(lugarComidaRandom, atraccionRandom);
    }
}
