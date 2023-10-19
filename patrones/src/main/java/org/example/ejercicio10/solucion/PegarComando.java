package org.example.ejercicio10.solucion;

public class PegarComando implements Comando {

    private Portapapeles portapapeles;

    public PegarComando(Portapapeles portapapeles) {
        this.portapapeles = portapapeles;
    }

    public void ejecutar() {
        portapapeles.pegar();
        // Logica especifica para pegar texto
        System.out.println("Pegando texto...");
    };
}
