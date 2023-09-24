package org.fiuba.algo3;

public class Materia {
    private String codigo;
    private String nombre;
    private int creditos;

    public Materia(String codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public int getCreditos() {
        return creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

}
