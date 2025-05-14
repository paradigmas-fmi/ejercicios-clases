package org.example.ejercicio5.inicial;

public abstract class Inyeccion {
    protected boolean conAntiVomitos;
    protected boolean conProtectorGastrico;

    protected abstract void aplicar(Paciente paciente);

    protected void agregarAntiVomitos() {
        this.conAntiVomitos = true;
    }

    protected void agregarProtectorGastrico() {
        this.conProtectorGastrico = true;
    }
}
