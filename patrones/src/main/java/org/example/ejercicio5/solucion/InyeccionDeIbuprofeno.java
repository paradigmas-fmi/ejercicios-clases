package org.example.ejercicio5.solucion;

public class InyeccionDeIbuprofeno implements Inyeccion {

    public void aplicar(Paciente paciente) {
        paciente.curarDolorDeCabeza();
        paciente.curarFatigaMuscular();
        System.out.println("> Aplicando ibuprofeno");
    }

}
