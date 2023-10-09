package ArregloEjercicios;

import java.util.Scanner;

public class PositivosyNegativos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Crear un array para almacenar los números
        int[] numeros = new int[10];

        // Variables para contar los números positivos y negativos, y sumar sus valores
        int countPositivos = 0;
        int countNegativos = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        // Leer los números e insertarlos en el array
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();

            if (numeros[i] > 0) {
                countPositivos++;
                sumaPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                countNegativos++;
                sumaNegativos += numeros[i];
            }
        }

        // Calcular promedios
        double promedioPositivos = (countPositivos > 0) ? (double) sumaPositivos / countPositivos : 0;
        double promedioNegativos = (countNegativos > 0) ? (double) sumaNegativos / countNegativos : 0;

        // Mostrar resultados
        System.out.println("Promedio de números positivos: " + promedioPositivos);
        System.out.println("Promedio de números negativos: " + promedioNegativos);

        entrada.close();
    }
}
