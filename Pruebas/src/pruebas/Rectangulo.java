package pruebas;

public class Rectangulo extends Figura {

    private double base, altura;

    Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double result = base * altura;
        return result;
    }

    @Override
    public double calcularPerimetro() {
        double result = (base * 2) + (altura * 2);
        return result;
    }
}
