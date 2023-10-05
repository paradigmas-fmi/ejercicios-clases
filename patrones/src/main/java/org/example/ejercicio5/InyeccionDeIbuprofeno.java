package org.example.ejercicio5;

public class InyeccionDeIbuprofeno extends Inyeccion {
    protected void aplicar(Paciente paciente) {
        paciente.curarDolorDeCabeza();
        paciente.curarFatigaMuscular();
    }
}
