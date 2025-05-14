package org.example.ejercicio5.inicial;

public class InyeccionDeParacetamol extends Inyeccion {
    protected void aplicar(Paciente paciente) {
        paciente.curarDolorDeCabeza();
        paciente.curarFatigaMuscular();

        // Tendra que tener logica por cada nueva condicion que quiera tratarse
        if (this.conAntiVomitos) {
            paciente.curarVomitos();
        }

        if (this.conProtectorGastrico) {
            paciente.curarDolorDePanza();
        }
    }
}
