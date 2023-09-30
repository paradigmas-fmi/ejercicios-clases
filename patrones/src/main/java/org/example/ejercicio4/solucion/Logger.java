package org.example.ejercicio4.solucion;

public class Logger {
    static Logger logger = null ;
    private Logger() {
    }

    public static Logger getLogger() {
        if (Logger.logger == null) {
            Logger.logger = new Logger();
        }
        return Logger.logger;
    }

    public void info(String message) {
        System.out.printf("[info] %s", message);
    }
}
