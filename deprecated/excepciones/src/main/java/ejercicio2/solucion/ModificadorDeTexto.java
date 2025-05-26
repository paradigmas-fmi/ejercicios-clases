package ejercicio2.solucion;

import java.io.IOException;

public class ModificadorDeTexto {
    private LectorArchivos lector;
    private boolean mayuscula;
    private String separador;

    public ModificadorDeTexto(LectorArchivos lector) {
        this.lector = lector;
        this.mayuscula = false;
        this.separador = " ";
    }

    public ModificadorDeTexto aMayuscula() {
        this.mayuscula = true;
        return this;
    }

    public ModificadorDeTexto conSeparador(String sep) {
        this.separador = sep;
        return this;
    }

    public String generar() throws IOException {
        String texto = this.lector.leer();
        if (mayuscula) {
            texto = texto.toUpperCase();
        }
        return String.join(separador, texto.split(" "));
    }
}
