package org.example.ejercicio1;

public class Guerrero {

    private Integer vida;
    private Integer fuerza;

    public Guerrero(Integer vida, Integer fuerza) {
        this.vida = vida;
        this.fuerza = fuerza;
    }

    public void atacar(Enemigo enemigo) {
        Integer vidaEnemigo = enemigo.getVida();
        enemigo.setVida(vidaEnemigo - this.fuerza);
    }
}
