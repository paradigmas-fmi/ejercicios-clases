package org.example.ejercicio5;

public class Clinica {

    public void atender(Paciente paciente) {
        // es alergico
        if (paciente.esAlergicoIbuprofeno()) {
            // le duele todo
            if ((paciente.tieneDolorDeCabeza() || paciente.tieneFatigaMuscular()) &&
                    paciente.tieneDolorDePanza() &&
                    paciente.tieneVomitos()) {
                new InyeccionDeParacetamolConReliveranYPropinox().aplicar(paciente);
            } else if ((paciente.tieneDolorDeCabeza() || paciente.tieneFatigaMuscular()) &&
                    paciente.tieneVomitos()) {
                new InyeccionDeParacetamolConReliveran().aplicar(paciente);
            } else if (paciente.tieneDolorDeCabeza() || paciente.tieneFatigaMuscular()) {
                new InyeccionDeParacetamolConReliveran().aplicar(paciente);
            }
        } else {
            // le duele todo
            if ((paciente.tieneDolorDeCabeza() || paciente.tieneFatigaMuscular()) &&
                    paciente.tieneDolorDePanza() &&
                    paciente.tieneVomitos()) {
                new InyeccionDeIbuprofenoConReliveranYPropinox().aplicar(paciente);
            } else if ((paciente.tieneDolorDeCabeza() || paciente.tieneFatigaMuscular()) &&
                    paciente.tieneVomitos()) {
                new InyeccionDeIbuprofenoConReliveran().aplicar(paciente);
            } else if (paciente.tieneDolorDeCabeza() || paciente.tieneFatigaMuscular()) {
                new InyeccionDeIbuprofeno().aplicar(paciente);
            }
        }
    }

}
