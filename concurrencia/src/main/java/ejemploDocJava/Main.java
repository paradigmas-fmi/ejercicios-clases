package ejemploDocJava;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Thread> threads = new LinkedList<>();
        BoundedBuffer buffer = new BoundedBuffer();
        for (int i=0; i<100; i++) {
            Thread t = new Thread(() -> {
               int ponerElem = new Random().nextInt() % 2;

               try {
                   if (ponerElem == 0) {
                       buffer.put(new Object());
                   } else {
                       buffer.take();
                   }
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
            }, String.format("miThread-%d", i));
            t.start();
            threads.add(t);
        }
        threads.forEach((x) -> {
            try {
                x.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
