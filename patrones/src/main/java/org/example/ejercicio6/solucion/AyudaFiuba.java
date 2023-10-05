package org.example.ejercicio6.solucion;

// Fachada de ayuda para consultas FIUBA
public interface AyudaFiuba {

    String consultasFechas(int padron, String consulta);
    String consultasTramites(int padron, String consulta);
    String consultasAdministrativas(int padron, String consulta);

}
