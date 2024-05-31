package ej2simulacionDados;

public class Main {

    public static void main(String[] args) {
//        Thread sim1 = new Thread(new SimulacionDados(1, 1000));
//        Thread sim2 = new Thread(new SimulacionDados(2, 10));
//        Thread sim3 = new Thread(new SimulacionDados(2, 1000));
//        sim1.start();
//        sim2.start();
//        sim3.start();

        new SimulacionDadosThread(1, 1000).start();
        new SimulacionDadosThread(2, 10).start();
        new SimulacionDadosThread(2, 1000).start();
        new SimulacionDadosThread(3, 10000).start();
    }
}
