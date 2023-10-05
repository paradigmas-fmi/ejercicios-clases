package org.example.ejercicio5;

public class InyeccionDeIbuprofenoConReliveranYPropinox extends Inyeccion {
    protected void aplicar(Paciente paciente) {
        paciente.curarDolorDeCabeza();
        paciente.curarFatigaMuscular();
        paciente.curarDolorDePanza();
        paciente.curarVomitos();
    }
}
