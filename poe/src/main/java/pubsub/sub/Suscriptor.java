package pubsub.sub;

import pubsub.modelo.Noticia;

public interface Suscriptor {
    void notificar(Noticia noticia);

}
