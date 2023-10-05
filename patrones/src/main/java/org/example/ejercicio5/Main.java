package org.example.ejercicio5;

import org.example.ejercicio3.Sandwich;
import org.example.ejercicio3.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Clinica clinica = new Clinica();
        Paciente nuevoPaciente = new Paciente(true, true, true, false, true);

        System.out.println(nuevoPaciente.estado());
        clinica.atender(nuevoPaciente);
        System.out.println(nuevoPaciente.estado());
    }
}