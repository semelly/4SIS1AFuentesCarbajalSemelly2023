import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Inventario {
    private static Map<String, String> empleados = new HashMap<>();
    private static ArrayList<Producto> inventario = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Inventario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(3, 1));

        JButton btnLogin = new JButton("Iniciar Sesión");
        JButton btnRegistroEmpleado = new JButton("Registro de Empleado");
        JButton btnGestionInventario = new JButton("Gestión de Inventario");

        frame.add(btnLogin);
        frame.add(btnRegistroEmpleado);
        frame.add(btnGestionInventario);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = JOptionPane.showInputDialog(frame, "Ingrese el nombre de usuario:");
                String password = JOptionPane.showInputDialog(frame, "Ingrese la contraseña:");

                if (empleados.containsKey(username) && empleados.get(username).equals(password)) {
                    JOptionPane.showMessageDialog(frame, "¡Inicio de sesión exitoso!");
                    // Aquí se puede dirigir a la ventana de gestión de inventario o a otra funcionalidad deseada
                } else {
                    JOptionPane.showMessageDialog(frame, "Credenciales incorrectas. Intente nuevamente.");
                }
            }
        });

        btnRegistroEmpleado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = JOptionPane.showInputDialog(frame, "Ingrese el nombre de usuario:");
                String password = JOptionPane.showInputDialog(frame, "Ingrese la contraseña:");

                empleados.put(username, password);
                JOptionPane.showMessageDialog(frame, "Empleado registrado exitosamente.");
            }
        });

        btnGestionInventario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí se puede implementar la lógica para gestionar el inventario
                // Esto podría incluir agregar productos, mostrar inventario actual, etc.
                // Por ejemplo:
                agregarProductoAlInventario();
            }
        });

        frame.setVisible(true);
    }

    private static void agregarProductoAlInventario() {
        String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio:"));

        Producto nuevoProducto = new Producto(nombreProducto, cantidad, precio);
        inventario.add(nuevoProducto);
        JOptionPane.showMessageDialog(null, "Producto agregado al inventario.");
    }
}

class Producto {
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    
}
