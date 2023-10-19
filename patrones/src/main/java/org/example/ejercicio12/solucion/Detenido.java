package org.example.ejercicio12.solucion;


public class Detenido implements Estado {
    private ReproductorDeAudio reproductorDeAudio;

    public Detenido(ReproductorDeAudio reproductorDeAudio) {
        this.reproductorDeAudio = reproductorDeAudio;
    }

    public void reproducir() {
        System.out.println("Reproduciendo audio.");
        reproductorDeAudio.setEstado(new Reproduciendo(this.reproductorDeAudio));
    }

    public void pausar() {
        System.out.println("Pausando audio.");
        reproductorDeAudio.setEstado(new Pausado(this.reproductorDeAudio));
    }

    public void detener() {
        System.out.println("Deteniendo audio.");
    }
}