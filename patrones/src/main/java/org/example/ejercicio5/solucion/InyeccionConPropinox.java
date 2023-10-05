package org.example.ejercicio5.solucion;

public class InyeccionConPropinox extends DecoradorDeInyeccion {

    public void aplicar(Paciente paciente) {
        paciente.curarDolorDePanza();
        System.out.println("> Aplicando propinox");
        this.aplicadoA.aplicar(paciente);
    }

}
