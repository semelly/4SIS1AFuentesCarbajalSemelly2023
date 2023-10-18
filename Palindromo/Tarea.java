import java.util.Scanner;

public class Tarea {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;

            while (continuar) {
                System.out.print("Ingresa una palabra o frase para verificar si es un palíndromo: ");
                String input = scanner.nextLine();

                if (esPalindromo(input)) {
                    System.out.println("Es un palíndromo.");
                } else {
                    System.out.println("No es un palíndromo.");
                }

                System.out.print("¿Deseas verificar otra palabra o frase? (S/N): ");
                String respuesta = scanner.nextLine();

                if (!respuesta.equalsIgnoreCase("S")) {
                    continuar = false;
                }
            }
        }
    }
   public static boolean esPalindromo(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();

        int izquierda = 0;
        int derecha = str.length() - 1;

        while (izquierda < derecha) {
            if (str.charAt(izquierda) != str.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }

        return true;
    }
}
