package org.example.controller;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.example.model.*;
import org.example.model.Config.ColoresJugadores;
import org.example.view.AlfilView;
import org.example.view.CaballoView;
import org.example.view.PiezaView;
import org.example.view.TorreView;

import java.util.HashMap;
import java.util.Map;

import static org.example.model.Config.ColoresJugadores.*;

public class PiezaImageViewFactory {
    final static Map<Class, String> piezasNegras = Map.ofEntries(
            Map.entry(Caballo.class, "imagenes/caballo_negro.png"),
            Map.entry(Alfil.class, "imagenes/alfil_negro.png"),
            Map.entry(Torre.class, "imagenes/torre_negro.png")
    );

    final static Map<Class, String> piezasBlancas = Map.ofEntries(
            Map.entry(Caballo.class, "imagenes/caballo_blanco.png"),
            Map.entry(Alfil.class, "imagenes/alfil_blanco.png"),
            Map.entry(Torre.class, "imagenes/torre_blanco.png")
    );

    final static Map<ColoresJugadores, Map<Class, String>> piezas = Map.ofEntries(
        Map.entry(BLANCO, piezasBlancas),
        Map.entry(NEGRO, piezasNegras)
    );

    public ImageView createPiezaImageView(Pieza pieza) {
        String path = piezas.get(pieza.getColor()).get(pieza.getClass());
        Image piezaImage = new Image(getClass().getResource("/org/example/" + path).toString());
        ImageView piezaImageView = new ImageView();
        piezaImageView.setImage(piezaImage);
        return piezaImageView;
    }
}
