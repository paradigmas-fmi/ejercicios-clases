package org.example.ejercicio5.inicial;

public class Clinica {

    public void atender(Paciente paciente) {
        // es alergico
        if (paciente.esAlergicoIbuprofeno()) {
            Inyeccion inyeccion = new InyeccionDeParacetamol();

            if (paciente.tieneVomitos()) {
                inyeccion.agregarAntiVomitos();
            }
            if (paciente.tieneDolorDePanza()) {
                inyeccion.agregarProtectorGastrico();
            }
        } else {
            Inyeccion inyeccion = new InyeccionDeIbuprofeno();

            if (paciente.tieneVomitos()) {
                inyeccion.agregarAntiVomitos();
            }
            if (paciente.tieneDolorDePanza()) {
                inyeccion.agregarProtectorGastrico();
            }
        }
    }

}
