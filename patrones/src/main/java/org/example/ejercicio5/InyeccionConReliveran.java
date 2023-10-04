package org.example.ejercicio5;

public class InyeccionConReliveran extends Inyeccion {
    protected void aplicar(Paciente paciente) {
        paciente.curarVomitos();
    }
}
