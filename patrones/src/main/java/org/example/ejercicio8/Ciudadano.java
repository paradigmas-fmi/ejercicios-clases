package org.example.ejercicio8;

import java.util.List;
import java.util.Random;

public class Ciudadano {

    public String elegirLugarParaComer(InformacionTuristica centroInformacion) {
        Random randomizer = new Random();
        List<String> lugares = centroInformacion.gastronomiaRecomendada();
        String randomPick = lugares.get(randomizer.nextInt(lugares.size()));

        return randomPick;
    }

    public String elegirSalida(InformacionTuristica centroInformacion) {
        Random randomizer = new Random();
        List<String> lugares = centroInformacion.obtenerAtracciones();
        String randomPick = lugares.get(randomizer.nextInt(lugares.size()));

        return randomPick;
    }

}
