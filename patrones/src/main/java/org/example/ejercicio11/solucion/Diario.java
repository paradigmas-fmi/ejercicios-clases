package org.example.ejercicio11.solucion;

import java.util.ArrayList;
import java.util.List;

public class Diario {
    private List<Subscriptor> subscriptores = new ArrayList<>();
    private List<Noticia> noticias;

    public void agregarSubscriptor(Subscriptor subscriptor) {
        subscriptores.add(subscriptor);
    }

    public void eliminarLector(Subscriptor subscriptor) {
        subscriptores.remove(subscriptor);
    }

    public void publicarNoticia(Noticia noticia) {
        this.noticias.add(noticia);
        notificar(noticia);
    }

    private void notificar(Noticia noticia) {
        for (Subscriptor subscriptor : subscriptores) {
            subscriptor.recibirNoticia(noticia);
        }
    }
}
