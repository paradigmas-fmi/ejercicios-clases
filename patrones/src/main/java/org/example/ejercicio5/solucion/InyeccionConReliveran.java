package org.example.ejercicio5.solucion;

public class InyeccionConReliveran extends DecoradorDeInyeccion {

    public void aplicar(Paciente paciente) {
        paciente.curarVomitos();
        System.out.println("> Aplicando reliveran");
        this.aplicadoA.aplicar(paciente);
    }

}
