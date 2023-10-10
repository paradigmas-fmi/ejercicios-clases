package org.example.ejercicio13.solucion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new Ingeniero());
        empleados.add(new Manager());
        empleados.add(new Operario());

        Integer vacaciones = 0;

        VacacionesVisitor visitor = new VacacionesVisitor();

        for (Empleado empleado : empleados) {
            empleado.accept(visitor);
        }

        vacaciones = visitor.getTotalVacaciones();
    }
}