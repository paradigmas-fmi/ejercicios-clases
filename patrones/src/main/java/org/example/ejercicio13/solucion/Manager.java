package org.example.ejercicio13.solucion;

public class Manager implements Empleado {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
