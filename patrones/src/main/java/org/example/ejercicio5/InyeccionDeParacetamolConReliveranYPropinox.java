package org.example.ejercicio5;

public class InyeccionDeParacetamolConReliveranYPropinox extends Inyeccion {
    protected void aplicar(Paciente paciente) {
        paciente.curarDolorDeCabeza();
        paciente.curarFatigaMuscular();
        paciente.curarDolorDePanza();
        paciente.curarVomitos();
    }
}
