package herencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija una figura geométrica:");
        System.out.println("1. Rectángulo");
        System.out.println("2. Círculo");
        System.out.println("3. Triángulo");
        System.out.println("4. Rombo");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese la base del rectángulo: ");
                double baseRectangulo = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                double alturaRectangulo = scanner.nextDouble();

                Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
                System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
                break;

            case 2:
                System.out.print("Ingrese el radio del círculo: ");
                double radioCirculo = scanner.nextDouble();

                Circulo circulo = new Circulo(radioCirculo);
                System.out.println("Área del círculo: " + circulo.calcularArea());
                System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
                break;

            case 3:
                System.out.print("Ingrese la base del triángulo: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double alturaTriangulo = scanner.nextDouble();
                System.out.print("Ingrese el primer lado del triángulo: ");
                double lado1Triangulo = scanner.nextDouble();
                System.out.print("Ingrese el segundo lado del triángulo: ");
                double lado2Triangulo = scanner.nextDouble();
                System.out.print("Ingrese el tercer lado del triángulo: ");
                double lado3Triangulo = scanner.nextDouble();

                Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo, lado1Triangulo, lado2Triangulo, lado3Triangulo);
                System.out.println("Área del triángulo: " + triangulo.calcularArea());
                System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
                break;

            case 4:
                System.out.print("Ingrese la diagonal mayor del rombo: ");
                double diagonalMayorRombo = scanner.nextDouble();
                System.out.print("Ingrese la diagonal menor del rombo: ");
                double diagonalMenorRombo = scanner.nextDouble();

                Rombo rombo = new Rombo(diagonalMayorRombo, diagonalMenorRombo);
                System.out.println("Área del rombo: " + rombo.calcularArea());
                try {
                    System.out.println("Perímetro del rombo: " + rombo.calcularPerimetro());
                } catch (UnsupportedOperationException e) {
                    System.out.println(e.getMessage());
                }
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }
}
