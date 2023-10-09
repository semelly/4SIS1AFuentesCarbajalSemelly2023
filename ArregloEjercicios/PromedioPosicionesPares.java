package ArregloEjercicios;
import java.util.Scanner;

public class PromedioPosicionesPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Crear un array para almacenar los números
        int[] numeros = new int[10];

        // Leer los números e insertarlos en el array
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        // Calcular el promedio de los números en posiciones pares2
        
        int suma = 0;
        int countPares = 0;

        for (int i = 0; i < 10; i += 2) {
            suma += numeros[i];
            countPares++;
        }

        double promedioPares = (countPares > 0) ? (double) suma / countPares : 0;

        // Mostrar el resultado
        System.out.println("Promedio de números en posiciones pares: " + promedioPares);

        entrada.close();
    }
}
