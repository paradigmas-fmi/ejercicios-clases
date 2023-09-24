package org.fiuba.algo3;

import org.fiuba.algo3.materias.*;

import java.util.LinkedList;
import java.util.List;

public class SIU {

    public static void main(String[] args) {
        List<Materia> materias = new LinkedList<>();
        materias.add(new Algoritmos1Ingenieria());
        materias.add(new Algoritmos1Sistemas());
        materias.add(new Algoritmos2Ingenieria());
        materias.add(new Algoritmos2Ingenieria2020());
        materias.add(new Algoritmos2Sistemas());

        Usuario profNacho = new Usuario("Profesor", "Ignacio Raik", "iraik@fi.uba.ar", 0);
        Usuario alumno1 = new Usuario("Alumno", "Rick Chicago", "rchicago@fi.uba.ar", 12345);

    }
}
