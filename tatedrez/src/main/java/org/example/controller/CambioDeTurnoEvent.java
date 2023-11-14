package org.example.controller;

import javafx.event.Event;
import javafx.event.EventType;

public class CambioDeTurnoEvent extends Event {
    public static EventType<CambioDeTurnoEvent> CAMBIO_DE_TURNO_EVENT = new EventType<>("Cambio de Turno Event");

    public CambioDeTurnoEvent() {
        super(CAMBIO_DE_TURNO_EVENT);
    }
}
