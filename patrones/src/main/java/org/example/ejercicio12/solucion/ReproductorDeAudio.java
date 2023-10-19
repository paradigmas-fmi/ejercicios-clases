package org.example.ejercicio12.solucion;
class ReproductorDeAudio {

    private Estado estadoActual;

    public void setEstado(Estado estado) {
        this.estadoActual = estado;
    }
    public ReproductorDeAudio() {
        estadoActual = new Detenido(this);
    }

    public void pausar() {
        this.estadoActual.pausar();
    }

    public void detener() {
        this.estadoActual.detener();
    }

    public void reproducir() {
        this.estadoActual.reproducir();
    }
}
