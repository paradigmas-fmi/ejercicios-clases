package org.example.ejercicio6.inicial;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno(12345);
        DepartamentoDeAlumnos departamentoDeAlumnos = new DepartamentoDeAlumnos();
        SecretariaAcademica secretariaAcademica = new SecretariaAcademica();
        Tesoreria tesoreria = new Tesoreria();

        List<DeptoFiuba> posiblesDestinos = List.of(departamentoDeAlumnos, secretariaAcademica, tesoreria);
        alumno.consultarFechas(posiblesDestinos);
    }
}