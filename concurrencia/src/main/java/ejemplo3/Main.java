package ejemplo3;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        for (int i=0; i<1000; i++) {
            if (!simulacionBanco()) {
                System.out.println("FALLO UNA SIMULACION!!");
                break;
            }
        }
    }

    private static boolean simulacionBanco() throws InterruptedException {
        CuentaBancaria cuenta1 = new CuentaBancaria(20000, 550);
        CuentaBancaria cuenta2 = new CuentaBancaria(80000, 1000);

        List<Integer> transferenciasPesos1a2 = List.of(1000, -1000, 1000, -1000, 1000, -1000, 1000, -1000, 1000, -1000);
        List<Integer> transferenciasUsds1a2 = List.of(10, 10, 10, 10, 10, -10, -10, -10, -10, -10);

        int resultadoEsperadoCuenta1 = cuenta1.verCuentaPesos() + transferenciasPesos1a2.stream().mapToInt(Integer::intValue).sum() +
                1000*(cuenta1.verCuentaUsds() + transferenciasUsds1a2.stream().mapToInt(Integer::intValue).sum());
        int resultadoEsperadoCuenta2 = cuenta2.verCuentaPesos() - transferenciasPesos1a2.stream().mapToInt(Integer::intValue).sum() +
                1000*(cuenta2.verCuentaUsds() - transferenciasUsds1a2.stream().mapToInt(Integer::intValue).sum());

        Thread t1 = new Thread(() -> {
            // Thread que realiza transferencias en pesos
            int i = 0;
            for (Integer movimiento: transferenciasPesos1a2) {
                i+=1;
                System.out.printf("Comienzo - Transfencia en pesos nro %d\n", i);

//                synchronized (cuenta1) {
                    int valorActualCuenta1 = cuenta1.verCuentaPesos();
                    cuenta1.setCuentaPesos(valorActualCuenta1 + movimiento);
//                }
//                synchronized (cuenta2) {
                    int valorActualCuenta2 = cuenta2.verCuentaPesos();
                    cuenta2.setCuentaPesos(valorActualCuenta2 - movimiento);
//                }
                System.out.printf("Fin - Transfencia en pesos nro %d realizada\n", i);
            }
        });
        Thread t2 = new Thread(() -> {
            // Thread que realiza transferencias en dolares
            int i = 0;
            for (Integer movimiento: transferenciasUsds1a2) {
                i+=1;
                System.out.printf("Comienzo - Transfencia en usds nro %d\n", i);
//                synchronized (cuenta1) {
                    int valorActualCuenta1 = cuenta1.verCuentaUsds();
                    cuenta1.setCuentaUsds(valorActualCuenta1 + movimiento);
//                }
//                synchronized (cuenta2) {
                    int valorActualCuenta2 = cuenta2.verCuentaUsds();
                    cuenta2.setCuentaUsds(valorActualCuenta2 - movimiento);
//                }
                System.out.printf("Fin - Transfencia en usds nro %d realizada\n", i);
            }
        });
        Thread t3 = new Thread(() -> {
            // Thread que realiza conversiones usds a pesos de 5 usds
            for (int i=0; i<10; i++) {
                System.out.printf("Comienzo - Conversion de pesos a usds nro %d\n", i);
//                synchronized (cuenta1) {
                    int valorActualPesosCuenta1 = cuenta1.verCuentaPesos();
                    cuenta1.setCuentaPesos(valorActualPesosCuenta1 + cuenta1.sacarUsds(5) * 1000);
//                }
//                synchronized (cuenta2) {
                    int valorActualPesosCuenta2 = cuenta2.verCuentaPesos();
                    cuenta2.setCuentaPesos(valorActualPesosCuenta2 + cuenta2.sacarUsds(5) * 1000);
//                }
                System.out.printf("Fin - Conversion de pesos a usds nro %d realizada\n", i);
            }
        });

        t1.start(); t2.start(); t3.start();
        t1.join(); t2.join(); t3.join();
        System.out.printf("Resultado => Cuenta1 Pesos = %d -- USDS = %d\n", cuenta1.verCuentaPesos(), cuenta1.verCuentaUsds());
        System.out.printf("Resultado => Cuenta2 Pesos = %d -- USDS = %d\n", cuenta2.verCuentaPesos(), cuenta2.verCuentaUsds());

        int resultadoObtenidoCuenta1 = cuenta1.verCuentaPesos() + transferenciasPesos1a2.stream().mapToInt(Integer::intValue).sum() +
                1000*(cuenta1.verCuentaUsds() + transferenciasUsds1a2.stream().mapToInt(Integer::intValue).sum());
        int resultadoObtenidoCuenta2 = cuenta2.verCuentaPesos() - transferenciasPesos1a2.stream().mapToInt(Integer::intValue).sum() +
                1000*(cuenta2.verCuentaUsds() - transferenciasUsds1a2.stream().mapToInt(Integer::intValue).sum());

        System.out.printf("%d = %d ; %d = %d\n", resultadoEsperadoCuenta1, resultadoObtenidoCuenta1, resultadoEsperadoCuenta2, resultadoObtenidoCuenta2);
        return resultadoEsperadoCuenta1 == resultadoObtenidoCuenta1 && resultadoEsperadoCuenta2 == resultadoObtenidoCuenta2;
    }
}
