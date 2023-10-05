package org.example.ejercicio5;

public class InyeccionDeIbuprofenoConReliveran extends Inyeccion {
    protected void aplicar(Paciente paciente) {
        paciente.curarDolorDeCabeza();
        paciente.curarFatigaMuscular();
        paciente.curarVomitos();
    }
}
