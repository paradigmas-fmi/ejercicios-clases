package org.example.ejercicio4;

import java.util.List;

public class SIU {
    public Integer getCreditosAlumnos(Alumno alumno) {
        List<Materia> materias = alumno.getMateriasAprobadas();
        Integer creditos = 0;
        for (Materia materia : materias) {
            creditos += materia.getCreditos();
        }
        return creditos;
    }
}
