package ejercicio2.solucion;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while(true) {
            System.out.println("Ingresar nombre de archivo (o 'quit' para parar):");
            String archivo = entrada.nextLine();
            if (archivo == "quit") break;

            LectorArchivos lector = new LectorDeRecursos(archivo);
            ModificadorDeTexto modificador = new ModificadorDeTexto(lector);

            try {
                String textoModif = modificador.aMayuscula().conSeparador("_").generar();
                System.out.println(textoModif);
            } catch (IOException e) {
                System.out.printf("Problema manipulando el archivo: %s\n\n", e.getMessage());
            }
        }
    }
}