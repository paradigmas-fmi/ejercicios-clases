package org.example.ejercicio5.solucion;

public class Clinica {

    public void atender(Paciente paciente) {
        Inyeccion inyeccion = paciente.esAlergicoIbuprofeno() ? new InyeccionDeParacetamol() : new InyeccionDeIbuprofeno();

        if (paciente.tieneDolorDePanza()) {
            inyeccion = new InyeccionConPropinox().añadirA(inyeccion);
        }
        if (paciente.tieneVomitos()) {
            inyeccion = new InyeccionConReliveran().añadirA(inyeccion);
        }

        inyeccion.aplicar(paciente);
    }

}
