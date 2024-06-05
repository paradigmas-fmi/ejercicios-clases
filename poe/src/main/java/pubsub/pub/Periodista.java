package pubsub.pub;

import pubsub.modelo.Noticia;
import pubsub.system.AgenciaDeNoticias;

import java.util.List;

public class Periodista extends Thread {
    private List<Noticia> noticiasAPublicar;
    private String categoria;
    private int cadenciaNoticias;

    private AgenciaDeNoticias agencia;

    public Periodista(String categoria, List<Noticia> noticiasAPublicar, AgenciaDeNoticias agencia) {
        this.categoria = categoria;
        this.noticiasAPublicar = noticiasAPublicar;
        this.agencia = agencia;
    }

    @Override
    public void run() {
        try {
            for (Noticia noticia: noticiasAPublicar) {
                Thread.sleep(1500);
                agencia.publicarNoticia(this.categoria, noticia);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
