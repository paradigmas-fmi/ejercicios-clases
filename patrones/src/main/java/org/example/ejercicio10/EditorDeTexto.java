package org.example.ejercicio10;

public class EditorDeTexto {
    private Portapapeles portapapeles;

    public void copiar() {
        portapapeles.copiar();
        // Logica especifica para copiar texto
        System.out.println("Copiando texto...");
    }

    public void cortar() {
        portapapeles.cortar();
        // Logica especifica para cortar texto
        System.out.println("Cortando texto...");
    }

    public void pegar() {
        portapapeles.pegar();
        // Logica especifica para pegar texto
        System.out.println("Pegando texto...");
    }
}
