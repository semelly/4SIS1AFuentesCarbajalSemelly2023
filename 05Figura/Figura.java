import java.util.Scanner;

public class Figura {

    // Variables
    double lado, altura, base, area, perimetro;
    int opcion;
    char letra;

    // Entrada de datos
    Scanner entrada = new Scanner(System.in);

    // Métodos

    public void menu() {
        // Vamos a hacer un programa para calcular área y perímetro de las figuras
        do {
            System.out.println("Bienvenido al programa de cálculo de áreas y perímetros");
            System.out.println("Elija una opción deseada: ");
            System.out.println("1.- Cuadrado");
            System.out.println("2.- Rectángulo");
            System.out.println("3.- Triángulo");
            System.out.println("Salir");

            // Obtener la lectura de la opción
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    calcularCuadrado();
                    break;
                case 2:
                    calcularRectangulo();
                    break;
                case 3:
                    calcularTriangulo();
                    break;
                default:
                    System.out.println("Gracias por elegir este lindo programa");
                    break;
            }
            System.out.println("Deseas repetir el programa, digita S");
            letra = entrada.next().charAt(0);

        } while (letra == 'S' || letra == 's');
    }

    public void calcularCuadrado() {
        try {
            System.out.println("Ingresa el valor del lado del cuadrado");

            lado = entrada.nextDouble();
            perimetro = lado * 4;
            area = lado * lado;
            System.out.println("El perímetro es de: " + perimetro + " El área es de: " + area);
        } catch (Exception e) {
            // Manejar el error
            System.out.println("Ingresa solo números");
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void calcularRectangulo() {
        try {
            System.out.println("Ingresa el valor de la base del rectángulo");
            base = entrada.nextDouble();
            System.out.println("Ingresa el valor de la altura del rectángulo");
            altura = entrada.nextDouble();

            perimetro = 2 * (base + altura);
            area = base * altura;
            System.out.println("El perímetro es de: " + perimetro + " El área es de: " + area);
        } catch (Exception e) {
            // Manejar el error
            System.out.println("Ingresa solo números");
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void calcularTriangulo() {
        try {
            System.out.println("Ingresa el valor de la base del triángulo");
            base = entrada.nextDouble();
            System.out.println("Ingresa el valor de la altura del triángulo");
            altura = entrada.nextDouble();

            area = (base * altura) / 2;
            // Puedes calcular el perímetro si conoces los lados, aquí solo se calcula el área
            System.out.println("El área del triángulo es de: " + area);
        } catch (Exception e) {
            // Manejar el error
            System.out.println("Ingresa solo números");
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Figura figura = new Figura();
        figura.menu();
    }
}
