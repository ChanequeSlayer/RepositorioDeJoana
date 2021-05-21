package pruebas;

public class Pruebas {

    public static void main(String[] args) {
        Rectangulo a = new Rectangulo(4, 2);
        Circulo b = new Circulo(4);
        System.out.println("El area de su rectangulo es: " + a.calcularArea() + "\n"
                + "El perimetro de su rectangulo es: " + a.calcularPerimetro() + "\n"
                + "El area de su circulo es: " + b.calcularArea() + "\n"
                + "El perimetro de su circulo es: " + b.calcularPerimetro());

    }

}
