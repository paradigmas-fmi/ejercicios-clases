package pubsub;

import pubsub.modelo.Noticia;
import pubsub.modelo.NoticiaStandard;
import pubsub.pub.AgenciaDeNoticias;
import pubsub.sub.PortalThread;

import java.util.AbstractMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AgenciaDeNoticias telam = new AgenciaDeNoticias();
        telam.agregarCategoria("internacional");
        telam.agregarCategoria("deportes");
        telam.agregarCategoria("musica");

        PortalThread diarioRosario = new PortalThread("Diario Rosario");
        PortalThread elGrafico = new PortalThread("El Grafico");
        PortalThread headBangers = new PortalThread("Headbangers");

        telam.agregarSuscriptor("internacional", diarioRosario);
        telam.agregarSuscriptor("deportes", diarioRosario);
        telam.agregarSuscriptor("deportes", elGrafico);
        telam.agregarSuscriptor("musica", headBangers);

        diarioRosario.start();
        elGrafico.start();
        headBangers.start();

        List<AbstractMap.SimpleEntry<String, Noticia>> aPublicar = List.of(
            new AbstractMap.SimpleEntry("internacional", new NoticiaStandard("Ucrania-Rusia", "Sigue la guerra")),
            new AbstractMap.SimpleEntry("musica", new NoticiaStandard("Murió Iorio", "Llora el metal")),
            new AbstractMap.SimpleEntry("deportes", new NoticiaStandard("Una Maravilla", "Martinez continua su racha goleadora")),
            new AbstractMap.SimpleEntry("internacional", new NoticiaStandard("Trump dijo...", "My name is Donald Trump")),
            new AbstractMap.SimpleEntry("deportes", new NoticiaStandard("Chau Tevez", "El Apache se despidió del Rojo en Platense"))
        );

        for (AbstractMap.SimpleEntry<String, Noticia> publicacion: aPublicar) {
            Thread.sleep(1500);
            telam.publicarNoticia(publicacion.getKey(), publicacion.getValue());
        }

        diarioRosario.desactivar();
        elGrafico.desactivar();
        headBangers.desactivar();
        diarioRosario.join();
        elGrafico.join();
        headBangers.join();
    }
}
