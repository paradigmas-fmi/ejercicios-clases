package pubsub.pub;

import pubsub.modelo.Noticia;
import pubsub.sub.Suscriptor;

import java.util.HashMap;
import java.util.Map;

public class AgenciaDeNoticias {
    private Map<String, SuscripcionCategoria> categorias;

    public AgenciaDeNoticias() {
        this.categorias = new HashMap<>();
    }
    public synchronized void agregarCategoria(String categoria) {
        categorias.putIfAbsent(categoria, new SuscripcionCategoria());
    }

    public synchronized boolean publicarNoticia(String categoria, Noticia noticia) {
        if (!categorias.containsKey(categoria)) {
            return false;
        }
        categorias.get(categoria).agregar(noticia);
        return true;
    }

    public synchronized boolean agregarSuscriptor(String categoria, Suscriptor suscriptor) {
        if (!categorias.containsKey(categoria)) {
            return false;
        }
        categorias.get(categoria).suscribir(suscriptor);
        return true;
    }
    public synchronized boolean quitarSuscriptor(String categoria, Suscriptor suscriptor) {
        if (!categorias.containsKey(categoria)) {
            return false;
        }
        categorias.get(categoria).desuscribir(suscriptor);
        return true;
    }
}
