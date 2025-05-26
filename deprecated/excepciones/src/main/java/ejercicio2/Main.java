package ejercicio2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        while(true) {
            System.out.println("Ingresar nombre de archivo (o 'quit' para parar):");
            String archivo = entrada.nextLine();
            if (archivo == "quit") break;

            LectorArchivos lector = new LectorDeRecursos(archivo);
            ModificadorDeTexto modificador = new ModificadorDeTexto(lector);

            String textoModif = modificador.aMayuscula().conSeparador("_").generar();
            System.out.println(textoModif);
        }
    }
}