package pruebas;

public class Circulo extends Figura{

    public double radio;

    Circulo(double r) {
        this.radio = r;
    }


    @Override
    public double calcularArea() {
        double result = Math.PI * Math.pow(radio, 2);
        return result;
    }

    @Override
    public double calcularPerimetro() {
        double result = 2 * Math.PI * radio;
        return result;
    }
}
