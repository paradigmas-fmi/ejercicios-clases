package org.example.ejercicio13.solucion;

public interface Visitor {

    void visit(Ingeniero ingeniero);

    void visit(Manager manager);

    void visit(Operario operario);
}
