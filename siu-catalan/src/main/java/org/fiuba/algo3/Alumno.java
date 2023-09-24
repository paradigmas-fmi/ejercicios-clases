package org.fiuba.algo3;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String mail;
    private int padronAlumno;
    private int creditosTotales;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, String mail, int padron) {
        this.nombre = nombre;
        this.mail = mail;
        this.padronAlumno = padron;
        this.materiasAprobadas = new ArrayList<>();
        this.creditosTotales = 0;
    }

    public void aprobarMateria(Materia materia) {
        this.materiasAprobadas.add(materia);
        this.creditosTotales += materia.getCreditos();
    }

    public boolean anotarCursada(Cursada cursada) {
        // TODO: ...
    }

}
