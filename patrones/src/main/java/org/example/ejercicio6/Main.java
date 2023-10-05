package org.example.ejercicio6;

import java.util.List;

import static com.sun.tools.javac.util.List.of;

public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno(12345);
        DepartamentoDeAlumnos departamentoDeAlumnos = new DepartamentoDeAlumnos();
        SecretariaAcademica secretariaAcademica = new SecretariaAcademica();
        Tesoreria tesoreria = new Tesoreria();

        List<DeptoFiuba> posiblesDestinos = of(departamentoDeAlumnos, secretariaAcademica, tesoreria);
        alumno.consultarFechas(posiblesDestinos);
    }
}