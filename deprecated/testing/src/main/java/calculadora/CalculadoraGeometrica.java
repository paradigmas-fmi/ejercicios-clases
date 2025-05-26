package calculadora;

public class CalculadoraGeometrica {

    public double sen(double x) {
        return Math.round(Math.sin(Math.toRadians(x)));
    }

    public double cos(double x) {
        return Math.cos(Math.toRadians(x));
    }

    public double tan(double x) {
        return Math.tan(Math.toRadians(x));
    }

    public double hipotenusa(double cat1, double cat2) {
        return Math.sqrt(cat1 * cat1 + cat2 * cat2);
    }

}
