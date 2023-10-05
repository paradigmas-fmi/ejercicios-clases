package org.example.ejercicio6.solucion;

import java.util.List;

import static com.sun.tools.javac.util.List.of;

public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno(12345);
        DepartamentoDeAlumnos departamentoDeAlumnos = new DepartamentoDeAlumnos();
        SecretariaAcademica secretariaAcademica = new SecretariaAcademica();
        Tesoreria tesoreria = new Tesoreria();
        AyudaFiuba centroDeAyuda = new BotiFiuba(departamentoDeAlumnos, secretariaAcademica, tesoreria);

        alumno.consultarFechas(centroDeAyuda);
    }
}