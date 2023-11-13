package ejemplo3;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        for (int i=0; i<10; i++) {
            Banco banco = new Banco(80000, 100);

            Thread t1 = new Thread(() -> {
                int pesos = banco.verCuentaPesos();
                int nuevosUsds = pesos / 780;
                banco.setCuentaPesos(0);
                banco.setCuentaUsds(banco.verCuentaUsds() + nuevosUsds);
            });
            Thread t2 = new Thread(() -> {
                int usds = banco.verCuentaUsds();
                int nuevosPesos = usds * 850;
                banco.setCuentaUsds(0);
                banco.setCuentaPesos(banco.verCuentaPesos() + nuevosPesos);
            });
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.printf("Cuenta Pesos = %d -- Cuenta USDS = %d\n", banco.verCuentaPesos(), banco.verCuentaUsds());
        }
    }
}
