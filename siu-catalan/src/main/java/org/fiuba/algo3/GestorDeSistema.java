package org.fiuba.algo3;

public class GestorDeSistema {

    public GestorDeSistema() {}

    public void aprobar(Usuario alumno, Materia materia) {
        alumno.aprobarMateria(materia);
        materia.aprobar(alumno);
    }
}
