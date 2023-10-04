package org.example.ejercicio5;

public class InyeccionDeParacetamol extends Inyeccion {
    protected void aplicar(Paciente paciente) {
        paciente.curarDolorDeCabeza();
        paciente.curarFatigaMuscular();
    }
}
