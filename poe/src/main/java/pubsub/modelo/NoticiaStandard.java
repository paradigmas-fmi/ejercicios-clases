package pubsub.modelo;

public class NoticiaStandard extends Noticia {
    private String cuerpo;

    public NoticiaStandard(String titulo, String cuerpo) {
        super(titulo);
        this.cuerpo = cuerpo;
    }

    @Override
    public String renderizar() {
        return String.format("%s>> %s", titulo, cuerpo);
    }
}
