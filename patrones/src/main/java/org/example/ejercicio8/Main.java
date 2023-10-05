package org.example.ejercicio8;

public class Main {
    public static void main(String[] args) {
        AgenciaDeTurismoLocal agenciaDeTurismo = new AgenciaDeTurismoLocal();
        Turista dimitri = new Turista();
        Ciudadano cacho = new Ciudadano();

        dimitri.elegirDestino(agenciaDeTurismo);
        cacho.elegirLugarParaComer(agenciaDeTurismo);

        TuristaDePaquetes familiaJohnson = new TuristaDePaquetes();
        // Esta agencia va a cerrar y los turistas de paquetes quedan a la deriva
        EmpaquetadorTuristico agenciaPaquetes = new AgenciaDeTurismoDePaquetesObsoleta();
        familiaJohnson.obtenerPaquete(agenciaPaquetes);
    }
}