package ejemplo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SimulacionDados implements Runnable {

    private int cantDados;
    private int tiradas;

    public SimulacionDados(int cantDados, int tiradas) {
        this.cantDados = cantDados;
        this.tiradas = tiradas;
    }

    @Override
    public void run() {
        Map<Integer, Integer> cantPorNumero = new HashMap<>();
        Random rand = new Random();
        for (int i=0; i<this.tiradas; ++i) {
            int valorTirada = 0;
            for (int j=0; j<this.cantDados; ++j) {
                valorTirada += rand.nextInt(6) + 1;
            }
            cantPorNumero.put(valorTirada, cantPorNumero.getOrDefault(valorTirada,0) + 1);
        }
        String result = "";
        for (int i=0; i<(this.cantDados*6); ++i) {
            result += String.format("%d=%d ", i+1, cantPorNumero.getOrDefault(i+1, 0));
        }
        System.out.printf("El resultado de la simulacion es: [%s]\n", result);
    }
}
