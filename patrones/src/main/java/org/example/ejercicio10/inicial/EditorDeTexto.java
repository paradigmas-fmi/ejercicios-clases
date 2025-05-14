package org.example.ejercicio10.inicial;

import java.util.HashMap;
import java.util.Map;

public class EditorDeTexto {
    private Map<String, String> shortcuts;
    private Portapapeles portapapeles;
    private String ultimaOperacion;

    public EditorDeTexto() {
        this.shortcuts = new HashMap<>();
        this.portapapeles = new Portapapeles();
        this.ultimaOperacion = null;
    }

    public void modificarShortcut(String combinacion, String operacion) {
        this.shortcuts.put(combinacion, operacion);
    }

    public void accionarShortcut(String combinacion) {
        String operacion = this.shortcuts.get(combinacion);

        switch (operacion) {
            case "copiar":
                this.portapapeles.copiar();
                this.ultimaOperacion = "copiar";
                break;
            case "pegar":
                this.portapapeles.pegar();
                this.ultimaOperacion = "pegar";
                break;
            case "cortar":
                this.portapapeles.copiar();
                // y elimina el texto actual
                this.ultimaOperacion = "cortar";
                break;
            case "deshacer":
                // hace algo con la ultimaOperacion
                break;
        }
    }
}
