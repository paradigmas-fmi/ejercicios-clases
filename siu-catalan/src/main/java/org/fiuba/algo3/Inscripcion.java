package org.fiuba.algo3;

public class Inscripcion {
    private String padronAlumno;
    private String mailAlumno;
    private int nroInscripto;
    private String materia;

    public Inscripcion(String padronAlumno, String mailAlumno, int nroInscripto, String materia) {
        this.padronAlumno = padronAlumno;
        this.mailAlumno = mailAlumno;
        this.nroInscripto = nroInscripto;
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }
}
