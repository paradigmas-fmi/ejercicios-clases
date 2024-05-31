package ej3cuentaBancaria;

public class CuentaBancaria {
    private int cuentaPesos;
    private int cuentaUsds;
    private static int CONVERSION = 800;

    public CuentaBancaria(int pesos, int usds) {
        this.cuentaPesos = pesos;
        this.cuentaUsds = usds;
    }

    public boolean pasarPesosAUsds(int cantidadPesos) {
        if (cantidadPesos > cuentaPesos) return false;

        this.cuentaPesos -= cantidadPesos;
        this.cuentaUsds += cantidadPesos/CONVERSION;

        return true;
    }

    public boolean pasarUsdsAPesos(int cantidadUsds) {
        if (cantidadUsds > cuentaUsds) return false;

        this.cuentaUsds -= cantidadUsds;
        this.cuentaPesos += cantidadUsds * CONVERSION;

        return true;
    }

    public void setCuentaPesos(int pesos) {
        this.cuentaPesos = pesos;
    }

    public void setCuentaUsds(int usds) {
        this.cuentaUsds = usds;
    }

    public int sacarUsds(int cant) {
        if (cuentaUsds < cant) return -1;
        this.cuentaUsds -= cant;
        return cant;
    }

    public int sacarPesos(int cant) {
        if (cuentaPesos < cant) return -1;
        this.cuentaPesos -= cant;
        return cant;
    }

    public int verCuentaPesos() {
        return this.cuentaPesos;
    }

    public int verCuentaUsds() {
        return this.cuentaUsds;
    }
}
