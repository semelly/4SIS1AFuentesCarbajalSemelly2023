/* 
Java maneja clases, las cuales nos sirven para diferenciar objetos. Cada clase
puede contener uno o varios objetos y tipos de datos que coexisten dentro de la clase.

La clase debe llamarse igual que el nombre del archivo.
*/  

public class HolaMundo { 

    // Java es un lenguaje intermedio.
    // Lenguaje natural: inglés.
    // La máquina virtual es la encargada de transformar el lenguaje natural en instrucciones para la máquina.
    // JDK son los elementos para la compilación, interpretación y transformación del código.
    // Es un paradigma orientado a objetos.
    // Toda clase debe tener un método principal.
    public static void main(String[] args) { 
        // Es un método público, lo que significa que cualquiera tiene acceso a él.
        // Un método es un comportamiento de la clase.
        // Static (estático) significa que el método no cambia; en el momento de ejecución,
        // no habrá cambios en sus componentes, parámetros, elementos, etc.
        // Void significa que el método no devuelve nada; es un método vacío y no es necesario manipular los parámetros.
        // Podemos crear objetos llamados instancias.
        System.out.println("Hola mundo, ya aprendieron su primer código."); 
        // ¿Qué es la salida por defecto de la computadora? Correcto.
        // System es la clase que llama al sistema, es la librería que se encarga de los comportamientos del sistema.
        // Out es el objeto de salida estándar de la computadora, es decir, la pantalla.
        // Println es el método que permite al sistema imprimir en la pantalla.
        // Tercera regla: cada línea de código termina con un punto y coma (;).
        
        // Javac se utiliza para compilar el archivo.
        // Java se utiliza para ejecutar el archivo (coderbyte es el .class).
    }
}
