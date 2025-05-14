package org.example.ejercicio13.inicial;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        Integer vacaciones = 0;

        for (Empleado empleado : empleados) {
            if (empleado.getClass() == Manager.class) {
                vacaciones += 15; // Managers get 15 days of vacation
            } else if (empleado.getClass() == Ingeniero.class) {
                vacaciones += 10; // Engineers get 10 days of vacation
            } else if (empleado.getClass() == Operario.class) {
                vacaciones += 5;
            }
        }
    }
}