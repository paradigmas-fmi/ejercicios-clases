package org.example.ejercicio10.solucion;

public class DeshacerComando implements Comando {
    private EditorDeTexto editorDeTexto;

    public DeshacerComando(EditorDeTexto editorDeTexto) {
        this.editorDeTexto = editorDeTexto;
    }

    public void ejecutar() {
        // le pedi la ultima accion al editor de texto y realiza la inversa para deshacerla
    };
}
