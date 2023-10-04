package org.example.ejercicio8;

import com.sun.tools.javac.util.List;
import org.example.ejercicio7.Expresion;
import org.example.ejercicio7.Multiplicacion;
import org.example.ejercicio7.ProcesadorMatematico;
import org.example.ejercicio7.Suma;

public class Main {
    public static void main(String[] args) {
        AgenciaDeTurismoLocal agenciaDeTurismo = new AgenciaDeTurismoLocal();
        Turista dimitri = new Turista();
        Ciudadano cacho = new Ciudadano();

        dimitri.elegirDestino(agenciaDeTurismo);
        cacho.elegirLugarParaComer(agenciaDeTurismo);
    }
}