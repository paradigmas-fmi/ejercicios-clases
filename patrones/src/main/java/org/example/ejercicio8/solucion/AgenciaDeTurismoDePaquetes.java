package org.example.ejercicio8.solucion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AgenciaDeTurismoDePaquetes implements EmpaquetadorTuristico {

    private List<List<String>> paquetes;

    public AgenciaDeTurismoDePaquetes() {
        this.paquetes = new ArrayList<List<String>>();
        this.paquetes.add(Arrays.asList("Obelisco", "Güerrin"));
        this.paquetes.add(Arrays.asList("Teatro Colon", "Tegui"));
        this.paquetes.add(Arrays.asList("Barrio Chino", "Roldan"));
    }
    public List<String> obtenerPaquete() {
        Random randomizer = new Random();
        List<String> paquete = paquetes.get(randomizer.nextInt(paquetes.size()));
        return paquete;
    }
}
