package org.example.ejercicio10.solucion;

public class CortarComando implements Comando {

    private Portapapeles portapapeles;

    public CortarComando(Portapapeles portapapeles) {
        this.portapapeles = portapapeles;
    }

    public void ejecutar() {
        portapapeles.cortar();
        // Logica especifica para cortar texto
        System.out.println("Cortando texto...");
    };
}
