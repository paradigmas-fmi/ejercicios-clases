package org.example.ejercicio5.solucion;

public class Clinica {

    public void atender(Paciente paciente) {
        Inyeccion inyeccion = paciente.esAlergicoIbuprofeno() ? new InyeccionDeParacetamol() : new InyeccionDeIbuprofeno();

        if (paciente.tieneDolorDePanza()) {
            inyeccion = new InyeccionConProtectorGastrico().añadirA(inyeccion);
        }
        if (paciente.tieneVomitos()) {
            inyeccion = new InyeccionConAntivomitos().añadirA(inyeccion);
        }

        inyeccion.aplicar(paciente);
    }

}
