package org.example.ejercicio10.solucion;

public class EditorDeTexto {
    private Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void ejecutarComando() {
        this.comando.ejecutar();
    }
}
