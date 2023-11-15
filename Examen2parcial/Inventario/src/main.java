/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sefue
 */
public class main {
    public class Main {
    public static void main(String[] args) {
        inventario inventario = new inventario();

        // Ejemplo de agregado de cereales al inventario
        Cerial cereal1 = new Cerial("Cereal de Maíz", 20, 3.99);
        Cerial cereal2 = new Cerial("Cereal de Trigo", 15, 4.50);

        inventario.agregarCereal(cereal1);
        inventario.agregarCereal(cereal2);

        // Mostrar el inventario de cereales
        for (Cereal cereal : inventario.getInventarioCereales()) {
            System.out.println(cereal.toString());
        }
    }
}

}
