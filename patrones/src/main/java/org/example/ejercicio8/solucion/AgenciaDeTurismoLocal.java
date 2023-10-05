package org.example.ejercicio8.solucion;

import java.util.Arrays;
import java.util.List;

public class AgenciaDeTurismoLocal implements InformacionTuristica {

    public List<String> obtenerAtracciones() {
        return Arrays.asList("Obelisco", "El Cilindro", "Teatro Colon");
    }

    public List<String> gastronomiaRecomendada() {
        return Arrays.asList("Don Julio", "Las Violetas", "Güerrin");
    }

    public List<String> revisarPromociones() {
        return Arrays.asList("2x1 Churros el Topo");
    }
}
