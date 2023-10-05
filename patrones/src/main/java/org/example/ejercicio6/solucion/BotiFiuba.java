package org.example.ejercicio6.solucion;

public class BotiFiuba implements AyudaFiuba {

    private DepartamentoDeAlumnos deptoAlumnos;
    private SecretariaAcademica secretaria;
    private Tesoreria tesoreria;

    public BotiFiuba(DepartamentoDeAlumnos alumnos, SecretariaAcademica secretaria, Tesoreria tesoreria) {
        this.deptoAlumnos = alumnos;
        this.secretaria = secretaria;
        this.tesoreria = tesoreria;
    }

    public String consultasFechas(int padron, String consulta) {
        deptoAlumnos.consultar(padron, consulta);
        return "";
    }

    public String consultasTramites(int padron, String consulta) {
        tesoreria.consultar(padron, consulta);
        return "";
    }

    public String consultasAdministrativas(int padron, String consulta) {
        secretaria.consultar(padron, consulta);
        return "";
    }
}
