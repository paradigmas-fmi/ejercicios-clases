package pubsub.system;

import pubsub.modelo.Noticia;
import pubsub.sub.Suscriptor;

import java.util.HashSet;
import java.util.Set;

public class SuscripcionCategoria {
    private final Set<Suscriptor> suscriptores;

    public SuscripcionCategoria() {
        this.suscriptores = new HashSet<>();
    }

    public void suscribir(Suscriptor suscriptor) {
        suscriptores.add(suscriptor);
    }

    public void desuscribir(Suscriptor suscriptor) {
        suscriptores.remove(suscriptor);
    }

    public void agregar(Noticia noticia) {
        for (Suscriptor suscriptor : suscriptores) {
            suscriptor.notificar(noticia);
        }
    }
}
