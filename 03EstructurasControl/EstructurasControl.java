import java.util.*;

class EstructurasControl {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int opcion, numbinario;
            String binario = "";
            char letra;

            do {
                System.out.println("Bienvenido al programa :3 ");
                System.out.println("Elije alguna opcion deseada: ");
                System.out.println("1.- Descuento por edad ");
                System.out.println("2.- Convertir numero decimal a binario ");
                System.out.println("3.- Convertir Temperaturas ");
                System.out.println("4.- Numeros Positivos y Negativos ");
                System.out.println("5.- Tiendita ");
                System.out.println("6.- Area y Perimetro ");
                System.out.println("7.- Tabla ");
                System.out.println("8.- Factorial ");
                System.out.println("9.- Dibujito ");
                System.out.println("10.- Figura Hueca ");
                System.out.println("11.- Patrones de Codigo ");
                System.out.println("12.- Diamante ");
                System.out.println("13.- Calculadora ");
                System.out.println("14.- Salir ");

                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                    System.out.print("Por favor, ingrese su edad: ");
                    int edad = entrada.nextInt();
                    double descuento = 0;
                
                    if (edad > 65) {
                        descuento = 0.4; // Aplicar un descuento del 40%
                    } else if (edad < 21) {
                        System.out.print("¿Sus padres son socios? (Sí/No): ");
                        String respuesta = entrada.next().toLowerCase();
                        if (respuesta.equals("sí")) {
                            descuento = 0.45; // Aplicar un descuento del 45%
                        } else {
                            descuento = 0.25; // Aplicar un descuento del 25%
                        }
                    }
                
                    double precioAbono = 100; // Precio base del abono
                    double precioFinal = precioAbono - (precioAbono * descuento);
                
                    System.out.printf("El precio final del abono es: $%.2f%n", precioFinal);
                        break;
                    case 2:
                        System.out.println("Ingresa un numero positivo entero que desee convertir a binario");
                        numbinario = entrada.nextInt();
                        if (numbinario > 0) {
                            while (numbinario > 0) {
                                if (numbinario % 2 == 0) {
                                    binario = "0" + binario;
                                } else {
                                    binario = "1" + binario;
                                }
                                numbinario = (int) numbinario / 2;
                            }

                        } else if (numbinario == 0) {
                            binario = "0" + binario;
                        } else {
                            binario = "No se puede convertir un numero negativo, solo positivos";
                        }
                        System.out.println("El numero binario es: " + binario);
                        break;
                    case 3:
                    System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
                    double fahrenheit = entrada.nextDouble();
                
                    System.out.println("Elija la conversión deseada:");
                    System.out.println("1. Fahrenheit a Celsius");
                    System.out.println("2. Fahrenheit a Kelvin");
                    System.out.println("3. Fahrenheit a Rankine");
                    System.out.print("Ingrese el número de la conversión deseada: ");
                    int opcionTemperatura = entrada.nextInt();
                
                    double resultadoTemperatura = 0.0;
                
                    switch (opcionTemperatura) {
                        case 1:
                            resultadoTemperatura = (fahrenheit - 32) * 5 / 9;
                            System.out.println("Temperatura en grados Celsius: " + resultadoTemperatura);
                            break;
                        case 2:
                            resultadoTemperatura = (fahrenheit - 32) * 5 / 9 + 273.15;
                            System.out.println("Temperatura en grados Kelvin: " + resultadoTemperatura);
                            break;
                        case 3:
                            resultadoTemperatura = fahrenheit + 459.67;
                            System.out.println("Temperatura en grados Rankine: " + resultadoTemperatura);
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, elija una conversión válida.");
                    }
                        break;
                    case 4:
                    System.out.print("Ingrese la cantidad de números: ");
                    int cantidadNumeros = entrada.nextInt();
                
                    int positivos = 0;
                    int negativos = 0;
                
                    for (int i = 1; i <= cantidadNumeros; i++) {
                        System.out.print("Ingrese el número " + i + ": ");
                        double numero = entrada.nextDouble();
                
                        if (numero > 0) {
                            positivos++;
                        } else if (numero < 0) {
                            negativos++;
                        }
                    }
                
                    System.out.println("Cantidad de números positivos: " + positivos);
                    System.out.println("Cantidad de números negativos: " + negativos);
                        break;
                    case 5:
                    System.out.print("Ingrese la cantidad de productos que desea comprar: ");
                    int cantidadProductos = entrada.nextInt();
                
                    String[] nombresProductos = new String[cantidadProductos];
                    double[] preciosProductos = new double[cantidadProductos];
                
                    for (int i = 0; i < cantidadProductos; i++) {
                        entrada.nextLine(); // Consumir el salto de línea pendiente
                        System.out.print("Ingrese el nombre del producto #" + (i + 1) + ": ");
                        nombresProductos[i] = entrada.nextLine();
                        System.out.print("Ingrese el precio del producto #" + (i + 1) + ": ");
                        preciosProductos[i] = entrada.nextDouble();
                    }
                
                    double totalFactura = 0.0;
                    System.out.println("\nFactura:");
                    for (int i = 0; i < cantidadProductos; i++) {
                        System.out.println(nombresProductos[i] + ": $" + preciosProductos[i]);
                        totalFactura += preciosProductos[i];
                    }
                
                    System.out.println("\nTotal de productos comprados: " + cantidadProductos);
                    System.out.println("Total de la factura: $" + totalFactura);
                        
                        break;
                    case 6:
                    System.out.println("Rectángulo:");
                    System.out.print("Ingrese la longitud del lado A: ");
                    double ladoA = entrada.nextDouble();
                    System.out.print("Ingrese la longitud del lado B: ");
                    double ladoB = entrada.nextDouble();
                    double areaRectangulo = ladoA * ladoB;
                    double perimetroRectangulo = 2 * (ladoA + ladoB);
                    System.out.println("Área del rectángulo: " + areaRectangulo);
                    System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
                        break;
                    case 7:
                        break;
                    case 8:
                    
                        break;
                    case 9:
                        
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                        break;
                    case 14:
                        break;
                    default:
                        System.out.println("Elija una opcion valida por fis");
                        break;
                }

                System.out.println("Deseas repetir el programa?, escribe s para si");
                letra = entrada.next().charAt(0);

            } while (letra == 's' || letra == 'S');
        }
    }
}
