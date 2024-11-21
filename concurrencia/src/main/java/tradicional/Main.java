package tradicional.ej4contadorCondVars;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Condition esImparUltimoImpreso = lock.newCondition();
        Condition esParUltimoImpreso = lock.newCondition();
        final Integer[] ultimoImpreso = {-1};

        Thread tPares = new Thread(() -> {
           for(int i=0; i<1000000; i+=2) {
               lock.lock();

               try {
                   while (ultimoImpreso[0] % 2 == 0) {
                           esImparUltimoImpreso.await();
                   }
                   System.out.printf("P: %d\n", i);
                   ultimoImpreso[0] = i;
                   esParUltimoImpreso.signal();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               } finally {
                   lock.unlock();
               }
           }
        });
        Thread tImpares = new Thread(() -> {
            for(int i=1; i<=1000000; i+=2) {
                lock.lock();

                try {
                    while (ultimoImpreso[0] % 2 != 0) {
                        esParUltimoImpreso.await();
                    }
                    System.out.printf("I: %d\n", i);
                    ultimoImpreso[0] = i;
                    esImparUltimoImpreso.signal();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }
            }
        });
        tPares.start();
        tImpares.start();
        tPares.join();
        tImpares.join();
    }
}
