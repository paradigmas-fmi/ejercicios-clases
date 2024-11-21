package futures.ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        List<String> results = new ArrayList<>();
        Random random = new Random();

        CompletableFuture<Void> future = CompletableFuture
                .supplyAsync(() -> {
                    try {
                        Thread.sleep(random.nextInt(3) * 100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return "Hello";
                })
                .thenAccept(s -> results.add(s));

        // Llega a añadirse el resultado a la lista, antes de imprimir el size?
        System.out.println(results.size());
    }
}
