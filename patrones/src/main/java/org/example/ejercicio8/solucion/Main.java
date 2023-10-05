package org.example.ejercicio8.solucion;

public class Main {
    public static void main(String[] args) {
        InformacionTuristica agenciaDeTurismo = new AgenciaDeTurismoLocal();
        Turista dimitri = new Turista();
        Ciudadano cacho = new Ciudadano();

        dimitri.elegirDestino(agenciaDeTurismo);
        cacho.elegirLugarParaComer(agenciaDeTurismo);

        TuristaDePaquetes familiaJohnson = new TuristaDePaquetes();
        // AgenciaDeTurismoLocal desarrolla un adaptador para captar los clientes de paquetes, que quedaron a la deriva
        AdaptadorDePaquetes agenciaConPaquetes = new AdaptadorDePaquetes(agenciaDeTurismo);
        familiaJohnson.obtenerPaquete(agenciaConPaquetes);
    }
}