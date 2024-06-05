package pubsub.sub;

import pubsub.modelo.Noticia;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class PortalThread extends Thread implements Suscriptor {

    private BlockingQueue<Noticia> noticias;
    private String nombre;
    private boolean activo;

    public PortalThread(String nombre) {
        this.nombre = nombre;
        this.noticias = new LinkedBlockingQueue();
        this.activo = true;
    }

    public void desactivar() {
        activo = false;
    }

    @Override
    public void run() {
        try {
            while (activo) {
                Noticia noticia = noticias.poll(1L, TimeUnit.SECONDS);
                if (noticia != null) {
                    System.out.printf("Portal %s publica: %s\n", nombre, noticia.renderizar());
                }
            }
        } catch (InterruptedException e) {
            this.activo = false;
        }
    }

    @Override
    public void notificar(Noticia noticia) {
        try {
            noticias.put(noticia);
        } catch (InterruptedException e) {
            activo = false;
        }
    }
}
