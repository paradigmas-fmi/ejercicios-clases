package org.example.ejercicio6.solucion;

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