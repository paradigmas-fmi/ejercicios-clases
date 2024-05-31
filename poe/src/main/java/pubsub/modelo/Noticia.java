package pubsub.modelo;

public abstract class Noticia {
    protected String titulo;

    protected Noticia(String titulo) { this.titulo = titulo; }

    public String getTitulo() {
        return titulo;
    }

    public abstract String renderizar();
}
