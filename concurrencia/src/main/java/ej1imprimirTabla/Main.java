package ej1imprimirTabla;

public class Main {

    public static void main(String[] args) {
        int num = 20;
        System.out.printf("Vamos a calcular los primeros 1000 elementos de la tabla del %d\n", num);
        calcularTablaConcurrente(num);
    }

    public static void calcularTablaComun(int numero) {
        for (int i=0; i<1000; ++i) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%d x %d = %d\n", numero, i, numero*i);
        }
    }

    public static void calcularTablaConcurrente(int numero) {
        for (int i=0; i<1000; ++i) {
            final int n = i;
            Thread t = new Thread(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("%d x %d = %d\n", numero, n, numero*n);
            });
            t.start();
        }
    }

}
