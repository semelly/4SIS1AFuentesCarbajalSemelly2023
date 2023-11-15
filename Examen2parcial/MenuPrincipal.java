import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal<Inventario> extends JFrame implements ActionListener {
    JButton inventarioButton;
    JButton empleadosButton;

    public MenuPrincipal() {
        setTitle("Menú Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        inventarioButton = new JButton("Gestión de Inventario");
        empleadosButton = new JButton("Gestión de Empleados");

        inventarioButton.addActionListener(this);
        empleadosButton.addActionListener(this);

        panel.add(inventarioButton);
        panel.add(empleadosButton);

        add(panel);
    }
 public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.setVisible(true);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == inventarioButton) {
            // Aquí llamarías a tu clase de gestión de inventario o abrirías la ventana correspondiente
            inventario inventario = new inventario();
            inventario.setVisible(true);
        } else if (e.getSource() == empleadosButton) {
            // Aquí llamarías a tu clase de gestión de empleados o abrirías la ventana correspondiente
            GestionEmpleados gestionEmpleados = new GestionEmpleados();
            gestionEmpleados.isVisible (true;)
        }
    }
}