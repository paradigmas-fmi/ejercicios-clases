package org.example.ejercicio11.inicial;

import java.util.ArrayList;
import java.util.List;

public class Diario {
    private List<Lector> lectores = new ArrayList<>();
    private List<Noticia> noticias;

    public void agregarLector(Lector lector) {
        lectores.add(lector);
    }

    public void eliminarLector(Lector lector) {
        lectores.remove(lector);
    }

    public void publicarNoticia(Noticia noticia) {
        this.noticias.add(noticia);
        for (Lector lector : lectores) {
            lector.recibirNoticia(noticia);
        }
    }
}
