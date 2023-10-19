package org.example.ejercicio10.solucion;

public class CopiarComando implements Comando {

    private Portapapeles portapapeles;

    public CopiarComando(Portapapeles portapapeles) {
        this.portapapeles = portapapeles;
    }

    public void ejecutar() {
        portapapeles.copiar();
        // Logica especifica para copiar texto
        System.out.println("Copiando texto...");
    };
}
