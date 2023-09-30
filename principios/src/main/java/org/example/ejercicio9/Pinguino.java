package org.example.ejercicio9;

public class Pinguino extends Ave{

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Help! I cannot fly!");
    }
}
