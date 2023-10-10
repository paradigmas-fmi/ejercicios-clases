package calculadora;

public class CalculadoraCurryficada {

    private int valorActual;

    public CalculadoraCurryficada() {
        this.valorActual = 0;
    }

    public CalculadoraCurryficada(int valorInicial) {
        this.valorActual = valorInicial;
    }

    public CalculadoraCurryficada sumar(int x) {
        this.valorActual += x;
        return this;
    }

    public CalculadoraCurryficada restar(int x) {
        this.valorActual -= x;
        return this;
    }

    public CalculadoraCurryficada multiplicar(int x) {
        this.valorActual *= x;
        return this;
    }

    public CalculadoraCurryficada dividir(int x) {
        this.valorActual /= x;
        return this;
    }

    public CalculadoraCurryficada potencia(int e) {
        this.valorActual = this.valorActual ^ e;
        return this;
    }

    public int resultado() {
        return this.valorActual;
    }
}
