package org.example.ejercicio13.solucion;

public class Operario implements Empleado {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
