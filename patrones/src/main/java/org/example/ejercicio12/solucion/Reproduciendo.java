package org.example.ejercicio12.solucion;


public class Reproduciendo implements Estado {
    private ReproductorDeAudio reproductorDeAudio;

    public Reproduciendo(ReproductorDeAudio reproductorDeAudio) {
        this.reproductorDeAudio = reproductorDeAudio;
    }

    public void reproducir() {
        System.out.println("El audio ya se esta reproduciendo.");
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