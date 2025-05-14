package org.example.ejercicio12.inicial;
class ReproductorDeAudio {
    private enum Estado {REPRODUCIENDO, PAUSADO, DETENIDO}
    private Estado estadoActual;

    public ReproductorDeAudio() {
        estadoActual = Estado.DETENIDO;
    }

    public void reproducir() {
        switch (estadoActual) {
            case REPRODUCIENDO:
                System.out.println("El audio ya se esta reproduciendo.");
                break;
            case PAUSADO:
                System.out.println("Reanudando audio.");
                estadoActual = Estado.REPRODUCIENDO;
                break;
            case DETENIDO:
                System.out.println("Reproduciendo audio.");
                estadoActual = Estado.REPRODUCIENDO;
                break;
        }
    }

    public void pausar() {
        switch (estadoActual) {
            case REPRODUCIENDO:
                System.out.println("Pausando audio.");
                estadoActual = Estado.PAUSADO;
                break;
            case PAUSADO:
                System.out.println("El audio ya esta pausado.");
                break;
            case DETENIDO:
                System.out.println("No es posible pausar el audio, actualmente esta detenido.");
                break;
        }
    }

    public void detener() {
        switch (estadoActual) {
            case REPRODUCIENDO:
            case PAUSADO:
                System.out.println("Deteniendo audio.");
                estadoActual = Estado.DETENIDO;
                break;
            case DETENIDO:
                System.out.println("El audio ya esta detenido.");
                break;
        }
    }
}
