package ArregloEjercicios;
import java.util.Scanner;

public class EstadisticasCalificaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Crear un array para almacenar las calificaciones
        double[] calificaciones = new double[10];

        // Leer las calificaciones e insertarlas en el array
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la calificación del alumno " + (i + 1) + ": ");
            calificaciones[i] = entrada.nextDouble();
        }

        // Imprimir todas las calificaciones
        System.out.println("Calificaciones ingresadas:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + calificaciones[i]);
        }

        // Calcular el promedio de las calificaciones
        double suma = 0;
        for (int i = 0; i < 10; i++) {
            suma += calificaciones[i];
        }
        double promedio = suma / 10;

        // Encontrar la calificación más alta y la más baja
        double calificacionMasAlta = calificaciones[0];
        double calificacionMasBaja = calificaciones[0];

        for (int i = 1; i < 10; i++) {
            if (calificaciones[i] > calificacionMasAlta) {
                calificacionMasAlta = calificaciones[i];
            }
            if (calificaciones[i] < calificacionMasBaja) {
                calificacionMasBaja = calificaciones[i];
            }
        }

        // Contar el número de calificaciones superiores al promedio
        int contadorSuperioresAlPromedio = 0;
        for (int i = 0; i < 10; i++) {
            if (calificaciones[i] > promedio) {
                contadorSuperioresAlPromedio++;
            }
        }

        // Contar la cantidad de alumnos aprobados y reprobados (asumiendo 5 como nota de aprobación)
        int aprobados = 0;
        int reprobados = 0;
        for (int i = 0; i < 10; i++) {
            if (calificaciones[i] >= 5) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        // Mostrar los resultados
        System.out.println("Promedio de las calificaciones: " + promedio);
        System.out.println("Calificación más alta: " + calificacionMasAlta);
        System.out.println("Calificación más baja: " + calificacionMasBaja);
        System.out.println("Número de calificaciones superiores al promedio: " + contadorSuperioresAlPromedio);
        System.out.println("Cantidad de alumnos aprobados: " + aprobados);
        System.out.println("Cantidad de alumnos reprobados: " + reprobados);

        entrada.close();
    }
}
