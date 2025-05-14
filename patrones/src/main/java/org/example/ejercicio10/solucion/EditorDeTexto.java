package org.example.ejercicio10.solucion;

import java.util.HashMap;
import java.util.Map;

public class EditorDeTexto {
    private Map<String, Comando> shortcuts;
    private Comando ultimaAccion;

    public EditorDeTexto() {
        this.shortcuts = new HashMap<>();
    }

    public void modificarShortcut(String combinacion, Comando operacion) {
        this.shortcuts.put(combinacion, operacion);
    }

    public void accionarShortcut(String combinacion) {
        Comando operacion = this.shortcuts.get(combinacion);
        operacion.ejecutar();
        this.ultimaAccion = operacion;
    }
}
