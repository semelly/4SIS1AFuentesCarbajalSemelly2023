package herencia;

import java.util.*;
import java.util.Scanner;

class FiguraGeometrica {
    // Métodos para calcular el área y el perímetro.
    public double calcularArea() {
        return 0.0;
    }

    public double calcularPerimetro() {
        return 0.0;
    }
}

class Rectangulo extends FiguraGeometrica {
    private double longitud;
    private double anchura;

    public Rectangulo(double longitud, double anchura) {
        this.longitud = longitud;
        this.anchura = anchura;
    }

    @Override
    public double calcularArea() {
        return longitud * anchura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (longitud + anchura);
    }
}

class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // Para un triángulo, no se necesita calcular el perímetro en este ejemplo.
        return 0.0;
    }
}

class Rombo extends FiguraGeometrica {
    private double lado;
    private double diagonal1;
    private double diagonal2;

    public Rombo(double lado, double diagonal1, double diagonal2) {
        this.lado = lado;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calcularArea() {
        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FiguraGeometrica figura = null;

        try {
            System.out.println("Elige una figura geométrica:");
            System.out.println("1. Rectángulo");
            System.out.println("2. Círculo");
            System.out.println("3. Triángulo");
            System.out.println("4. Rombo");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la longitud del rectángulo: ");
                    double longitud = scanner.nextDouble();
                    System.out.print("Ingresa la anchura del rectángulo: ");
                    double anchura = scanner.nextDouble();
                    figura = new Rectangulo(longitud, anchura);
                    break;
                case 2:
                    System.out.print("Ingresa el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    figura = new Circulo(radio);
                    break;
                case 3:
                    System.out.print("Ingresa la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingresa la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    figura = new Triangulo(base, altura);
                    break;
                case 4:
                    System.out.print("Ingresa el lado del rombo: ");
                    double lado = scanner.nextDouble();
                    System.out.print("Ingresa la diagonal 1 del rombo: ");
                    double diagonal1 = scanner.nextDouble();
                    System.out.print("Ingresa la diagonal 2 del rombo: ");
                    double diagonal2 = scanner.nextDouble();
                    figura = new Rombo(lado, diagonal1, diagonal2);
                    break;
                default:
                    System.out.println("Opción no válida");
            }

            if (figura != null) {
                System.out.println("Área: " + figura.calcularArea());
                System.out.println("Perímetro: " + figura.calcularPerimetro());
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada no válida. Debes ingresar un número.");
        } finally {
            scanner.close();
        }
    }
}
