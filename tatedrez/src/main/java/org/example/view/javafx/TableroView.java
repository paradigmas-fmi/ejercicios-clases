package org.example.view.javafx;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.example.model.Pieza;
import org.example.model.Tablero;
import org.example.view.console.PiezaView;
import org.example.view.console.PiezaViewFactory;

import java.util.Optional;

public class TableroView {
    private PiezaViewFactory piezaViewFactory;
    private Tablero tablero;

    public TableroView(Tablero tablero) {

        this.tablero = tablero;
        this.piezaViewFactory = new PiezaViewFactory();
    }

    public void mostrar() {
        // Create a GridPane
        GridPane pane = new GridPane();

        // Create 64 rectangles and add to pane
        int count = 0;
        double s = 100; // side of rectangle
        for (int i = 0; i < 8; i++) {
            count++;
            for (int j = 0; j < 8; j++) {
                Rectangle r = new Rectangle(s, s, s, s);
                if (count % 2 == 0)
                    r.setFill(Color.WHITE);
                pane.add(r, j, i);
                count++;
            }
        }

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
//        primaryStage.setTitle("java2s.com");
//        primaryStage.setScene(scene); // Place in scene in the stage
//        primaryStage.show();

        Integer dimensiones = tablero.getDimensiones();

        for (Integer i = 0; i < dimensiones; i++) {
            for (Integer j = 0; j < dimensiones; j++) {
                Optional<Pieza> pieza = tablero.getPieza(i, j);
                if (pieza.isEmpty()) {
                    System.out.print(" _ ");
                } else {
                    PiezaView piezaVista = this.piezaViewFactory.createPiezaView(pieza.get());
                    piezaVista.mostrar();
                }
            }
            System.out.println();
        }
    }
}
