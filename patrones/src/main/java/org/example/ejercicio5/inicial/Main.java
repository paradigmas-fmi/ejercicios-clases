package org.example.ejercicio5.inicial;

public class Main {
    public static void main(String[] args) {
        Clinica clinica = new Clinica();
        Paciente nuevoPaciente = new Paciente(true, true, true, false, true);

        System.out.println(nuevoPaciente.estado());
        clinica.atender(nuevoPaciente);
        System.out.println(nuevoPaciente.estado());
    }
}