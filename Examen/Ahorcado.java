import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        jugarAhorcado();
    }

    public static void jugarAhorcado() {
        String[] palabras = {"programacion", "angel", "cadenas", "clases", "jugar", "algoritmo"};
        Random rand = new Random();
        String palabraSecreta = palabras[rand.nextInt(palabras.length)];
        int intentosMaximos = 6;
        int intentosRestantes = intentosMaximos;
        int puntaje = 0;

        char[] palabraAdivinada = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraAdivinada[i] = '_';
        }

        System.out.println("¡Bienvenido al juego de Ahorcado!");
        System.out.println("La palabra a adivinar tiene " + palabraSecreta.length() + " letras.");
        System.out.println("La primera letra es " + palabraSecreta.charAt(0) + " y la última letra es " + palabraSecreta.charAt(palabraSecreta.length() - 1));

        Scanner scanner = new Scanner(System.in);

        while (intentosRestantes > 0) {
            System.out.println("\nPalabra: " + new String(palabraAdivinada));
            System.out.println("Intentos restantes: " + intentosRestantes);

            System.out.print("Ingresa una letra: ");
            String input = scanner.next().toLowerCase();

            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Ingresa una letra válida.");
                continue;
            }

            boolean acierto = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == input.charAt(0)) {
                    palabraAdivinada[i] = input.charAt(0);
                    acierto = true;
                }
            }

            if (acierto) {
                System.out.println("¡Adivinaste una letra!");
                puntaje += 10;
            } else {
                System.out.println("Letra incorrecta. Pierdes un intento.");
                intentosRestantes--;
                puntaje -= 5;
            }

            if (new String(palabraAdivinada).equals(palabraSecreta)) {
                System.out.println("¡Felicidades! Adivinaste la palabra: " + palabraSecreta);
                System.out.println("Tu puntaje es: " + puntaje);
                break;
            }
        }

        if (intentosRestantes == 0) {
            System.out.println("¡Perdiste! La palabra secreta era: " + palabraSecreta);
        }

        scanner.close();
    }
}
