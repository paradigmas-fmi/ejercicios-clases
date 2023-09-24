package org.fiuba.algo3;

import java.util.LinkedList;
import java.util.List;

public class Cursada {
    private String cuatrimestre; // "2023c1"
    private List<String> profesores;
    private List<Usuario> alumnos;

    public Cursada(String cuatrimestre, List<String> profesores) {
        this.cuatrimestre = cuatrimestre;
        this.profesores = profesores;
        this.alumnos = new LinkedList<>();
    }

    public void anotarAlumno(Usuario alumno) {
        this.alumnos.add(alumno);
    }

    public void desanotarAlumno(Usuario alumno) {
        this.alumnos.remove(alumno);
    }
}
