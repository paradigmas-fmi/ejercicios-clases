package org.example.ejercicio12.solucion;


public class Pausado implements Estado {
    private ReproductorDeAudio reproductorDeAudio;

    public Pausado(ReproductorDeAudio reproductorDeAudio) {
        this.reproductorDeAudio = reproductorDeAudio;
    }

    public void reproducir() {
        System.out.println("Reanudando audio.");
        reproductorDeAudio.setEstado(new Reproduciendo(this.reproductorDeAudio));
    }

    public void pausar() {
        System.out.println("Pausando audio.");
        reproductorDeAudio.setEstado(new Pausado(this.reproductorDeAudio));
    }

    public void detener() {
        System.out.println("Deteniendo audio.");
        reproductorDeAudio.setEstado(new Detenido(this.reproductorDeAudio));

    }
}