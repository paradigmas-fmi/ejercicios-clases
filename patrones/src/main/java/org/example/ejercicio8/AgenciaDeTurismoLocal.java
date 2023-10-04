package org.example.ejercicio8;

import com.sun.tools.javac.util.List;

public class AgenciaDeTurismoLocal implements InformacionTuristica {

    public List<String> obtenerAtracciones() {
        return List.of("Obelisco", "El Cilindro", "Teatro Colon");
    }

    public List<String> gastronomiaRecomendada() {
        return List.of("Don Julio", "Las Violetas", "Güerrin");
    }

    public List<String> revisarPromociones() {
        return List.of("2x1 Churros el Topo");;
    }
}
