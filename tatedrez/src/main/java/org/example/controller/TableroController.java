package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import org.example.model.Pieza;
import org.example.model.Juego;
import org.example.model.Tablero;

import java.util.Optional;

public class TableroController {

    private Juego juego;

    @FXML
    private GridPane tableroGrid;

    private Integer oi;

    private Integer oj;

    private StackPane[][] posiciones = null;

    public void initialize() {
        this.posiciones = new StackPane[3][3];
    }

    public void setJuego(Juego juego) {
        this.juego = juego;

        Tablero tablero = juego.getTablero();

        for (Node stackPane : tableroGrid.getChildren()) {
            Integer row = GridPane.getRowIndex(stackPane);
            Integer column = GridPane.getColumnIndex(stackPane);
            Integer i = row != null ? row : 0;
            Integer j = column != null ? column : 0;
            this.posiciones[i][j] = (StackPane) stackPane;
            Optional<Pieza> pieza = tablero.getPieza(i, j);
            if (pieza.isPresent()) {
                ImageView imageView = new PiezaImageViewFactory().createPiezaImageView(pieza.get());
                this.posiciones[i][j].getChildren().add(imageView);
            }
        }
    }


    public void handleMouseClicked(MouseEvent mouseEvent) {
        StackPane stackPane = (StackPane) mouseEvent.getSource();
        Integer row = GridPane.getRowIndex(stackPane);
        Integer column = GridPane.getColumnIndex(stackPane);
        Integer i = row != null ? row : 0;
        Integer j = column != null ? column : 0;

        if (this.oi == null && this.oj == null) {
            // Origen ocupado
            if (this.juego.getTablero().getPieza(i, j).isEmpty()) {
                return;
            }
            this.oi = i;
            this.oj = j;
        } else {
            // Destino libre
            if (this.juego.getTablero().getPieza(i, j).isPresent()) {
                return;
            }
            Boolean resultado = this.juego.mover(this.oi, this.oj, i, j);
            if (resultado) {
                ImageView imageView = (ImageView) this.posiciones[this.oi][this.oj].getChildren().remove(1);
                this.posiciones[i][j].getChildren().add(imageView);
                this.juego.cambiarTurno();
            }
            this.oi = null;
            this.oj = null;
        }
    }
}
