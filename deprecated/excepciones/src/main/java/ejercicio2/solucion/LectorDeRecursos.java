package ejercicio2.solucion;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class LectorDeRecursos implements LectorArchivos {
    private String nombreArchivo;

    public LectorDeRecursos(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public String leer() throws IOException {
        InputStream input = ClassLoader.getSystemResourceAsStream(nombreArchivo);
        if (input == null) {
            throw new IOException("No se encontró el archivo");
        }
        return new String(input.readAllBytes(), StandardCharsets.UTF_8);
    }
}
