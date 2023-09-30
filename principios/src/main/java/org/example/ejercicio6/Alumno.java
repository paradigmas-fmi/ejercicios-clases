package org.example.ejercicio6;

public class Alumno {
    private Integer creditos;
    private String nombre;
    private String padron;

    public void aprobarMateria(Materia materia) {
        creditos += materia.getCreditos();
    }

    public void mostrar() {
        System.out.println(
            "Alumno " + this.nombre + " con padrón " + this.padron + " tiene " + this.creditos + "creditos"
        );
    }
}
