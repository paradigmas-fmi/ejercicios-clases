package org.example.ejercicio13.solucion;

public class VacacionesVisitor implements Visitor {
    private Integer totalVacaciones = 0;

    public void visit(Ingeniero ingeniero) {
        this.totalVacaciones += 10;
    };

    public void visit(Manager manager) {
        this.totalVacaciones += 15;
    };

    public void visit(Operario operario) {
        this.totalVacaciones += 5;
    };

    public Integer getTotalVacaciones() {
        return totalVacaciones;
    }

}
