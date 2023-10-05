package org.example.ejercicio5;

public class InyeccionConPropinox extends Inyeccion {
    protected void aplicar(Paciente paciente) {
        paciente.curarDolorDePanza();
    }
}
