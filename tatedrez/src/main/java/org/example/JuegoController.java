package org.example;

import org.example.model.Juego;
import org.example.view.JuegoView;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import java.io.IOException;
import java.util.Arrays;

public class JuegoController {

    private Juego juego;
    private JuegoView vistaJuego;
    private LineReader reader;
    public JuegoController(Juego juego) throws IOException {
        this.juego = juego;
        this.vistaJuego = new JuegoView(juego);

        Terminal terminal = TerminalBuilder.terminal();

        reader = LineReaderBuilder.builder()
                .terminal(terminal)
                .build();
    }

    public void jugarTurno() {
        vistaJuego.mostrar();

        String origen = reader.readLine("Seleccione las coordenadas de la posición de origen (fila,col): ");
        String destino = reader.readLine("Seleccione las coordenadas de la posición de destino (fila,col): ");

        int[] coordenadasOrigen = Arrays.stream(origen.split(",")).mapToInt(Integer::parseInt).toArray();
        int[] coordenadasDestino = Arrays.stream(destino.split(",")).mapToInt(Integer::parseInt).toArray();

        if (juego.mover(coordenadasOrigen[0], coordenadasOrigen[1], coordenadasDestino[0], coordenadasDestino[1])) {
            juego.cambiarTurno();
        }
    }


}
