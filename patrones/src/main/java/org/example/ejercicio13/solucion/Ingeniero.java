package org.example.ejercicio13.solucion;

public class Ingeniero implements Empleado {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
