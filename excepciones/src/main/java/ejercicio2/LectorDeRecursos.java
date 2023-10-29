package ejercicio2;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

public class LectorDeRecursos implements LectorArchivos {
    private String nombreArchivo;

    public LectorDeRecursos(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public String leer() throws IOException {
        InputStream input = ClassLoader.getSystemResourceAsStream(nombreArchivo);
        return new String(input.readAllBytes(), StandardCharsets.UTF_8);
    }
}
