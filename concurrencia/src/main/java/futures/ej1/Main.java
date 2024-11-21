package futures.ej1;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        CompletableFuture<Void> future1 = CompletableFuture
                .runAsync(() -> System.out.println("Hello"));
        CompletableFuture<Void> future2 = CompletableFuture
                .runAsync(() -> {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Beautiful");
                });
        CompletableFuture<Void> future3 = CompletableFuture
                .runAsync(() -> {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("World!");
                });

        // En que orden ocurriran los prints?
        CompletableFuture<Void> combinedFuture = CompletableFuture
                .allOf(future1, future2, future3);

        combinedFuture.join();
    }
}
