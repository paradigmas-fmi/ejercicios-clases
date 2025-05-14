package org.example.ejercicio5.inicial;

public class InyeccionDeIbuprofeno extends Inyeccion {
    protected void aplicar(Paciente paciente) {
        paciente.curarDolorDeCabeza();
        paciente.curarFatigaMuscular();

        if (this.conAntiVomitos) {
            paciente.curarVomitos();
        }

        if (this.conProtectorGastrico) {
            paciente.curarDolorDePanza();
        }
    }
}
