package Ultimo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CajeroFrame extends JFrame {
    private Cajero cajero;

    public CajeroFrame() {
        super("Mi Cajero");
        cajero = new Cajero();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JButton retirarButton = new JButton("Retirar Dinero");
        JButton depositarButton = new JButton("Depositar Dinero");
        JButton cobrarAlimentoButton = new JButton("Cobrar Alimento");
        JButton recargarCelularButton = new JButton("Recargar Celular");
        JButton pagarAguaButton = new JButton("Pagar Servicio de Agua");
        JButton pagarLuzButton = new JButton("Pagar Servicio de Luz");
        panel.add(retirarButton);
        panel.add(depositarButton);
        panel.add(cobrarAlimentoButton);
        panel.add(recargarCelularButton);
        panel.add(pagarAguaButton);
        panel.add(pagarLuzButton);

        add(panel);

        retirarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String banco = JOptionPane.showInputDialog("Ingrese el nombre del banco:");
                String numeroTarjeta = JOptionPane.showInputDialog("Ingrese el número de tarjeta:");
                String input = JOptionPane.showInputDialog("Ingrese la cantidad a retirar:");
                if (input != null && !input.isEmpty()) {
                    double cantidad = Double.parseDouble(input);
                    cajero.retirar(cantidad);
                    mostrarResultado("Retiro", cantidad);
                }
            }
        });
        depositarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String banco = JOptionPane.showInputDialog("Ingrese el nombre del banco:");
                String numeroTarjeta = JOptionPane.showInputDialog("Ingrese el número de tarjeta:");
                String input = JOptionPane.showInputDialog("Ingrese la cantidad a depositar:");
                if (input != null && !input.isEmpty()) {
                    double cantidad = Double.parseDouble(input);
                    cajero.depositar(cantidad);
                    mostrarResultado("Depósito", cantidad);
                }
            }
        });

        cobrarAlimentoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Definir alimentos y precios
                String[] alimentos = {"Frituras", "Jugo", "Refresco", "Sopas", "Chicles", "Agua"};
                double[] precios = {15.0, 25.0, 20.0, 30.0, 5.0, 10.0};

                // Mostrar lista de alimentos
                StringBuilder mensaje = new StringBuilder("Seleccione alimentos:\n");
                for (int i = 0; i < alimentos.length; i++) {
                    mensaje.append(i + 1).append(". ").append(alimentos[i]).append(" - $").append(precios[i]).append("\n");
                }

   // Pedir selección de alimentos
   int maxProductos = 10;
   double total = 0.0;
   for (int i = 0; i < maxProductos; i++) {
       String seleccion = JOptionPane.showInputDialog(mensaje.toString() +
               "Ingrese el número de alimento (0 para finalizar):");
       int opcion = Integer.parseInt(seleccion) - 1;

       if (opcion == -1) {
           break;
       }

       if (opcion >= 0 && opcion < alimentos.length) {
           total += precios[opcion];
       } else {
           JOptionPane.showMessageDialog(null, "Opción no válida.");
           i--; // Decrementar para que el usuario ingrese la opción correcta.
       }
   }

   // Pagar
   cajero.cobrarAlimento(total);
   mostrarResultado("Cobro Alimento", total);
}
});
recargarCelularButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Definir compañías de celular
        String[] companias = {"Telcel", "Movistar", "Bait", "AT&T"};

        // Pedir selección de compañía
        String seleccionCompania = (String) JOptionPane.showInputDialog(null,
                "Seleccione la compañía de celular:",
                "Compañía de Celular",
                JOptionPane.QUESTION_MESSAGE,
                null,
                companias,
                companias[0]);

        if (seleccionCompania != null) {
            String numeroTelefono = JOptionPane.showInputDialog("Ingrese el número de teléfono:");
            String cantidadRecargaInput = JOptionPane.showInputDialog("Ingrese la cantidad a recargar:");
            
            if (cantidadRecargaInput != null && !cantidadRecargaInput.isEmpty()) {
                double cantidadRecarga = Double.parseDouble(cantidadRecargaInput);
                cajero.recargarCelular(cantidadRecarga);
                mostrarResultado("Recarga Celular", cantidadRecarga);
            } else {
                JOptionPane.showMessageDialog(null, "Error al recargar celular. Cantidad no válida.");
            }
        }
    }
});
pagarAguaButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String numeroTarjeta = JOptionPane.showInputDialog("Ingrese el número de tarjeta:");
        String input = JOptionPane.showInputDialog("Ingrese la cantidad a pagar por el servicio de agua:");
        if (input != null && !input.isEmpty()) {
            double cantidad = Double.parseDouble(input);
            cajero.pagarServicioAgua(cantidad);
            mostrarResultado("Pago de Servicio de Agua", cantidad);
        }
    }
});

pagarLuzButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String numeroTarjeta = JOptionPane.showInputDialog("Ingrese el número de tarjeta:");
        String input = JOptionPane.showInputDialog("Ingrese la cantidad a pagar por el servicio de luz:");
        if (input != null && !input.isEmpty()) {
            double cantidad = Double.parseDouble(input);
            cajero.pagarServicioLuz(cantidad);
            mostrarResultado("Pago de Servicio de Luz", cantidad);
        }
    }
});
}
private void mostrarResultado(String operacion, double monto) {
    JOptionPane.showMessageDialog(this, operacion + " realizado con éxito. Monto: $" + monto + "\nSaldo actual: $" + cajero.getSaldo());
    reiniciarInterfaz();
}

private void reiniciarInterfaz() {
    // Puedes implementar lógica para reiniciar la interfaz a la pantalla de inicio aquí
    // En este ejemplo, simplemente cierro la ventana, pero puedes hacer algo más complejo si es necesario.
    this.dispose();
    SwingUtilities.invokeLater(() -> {
        CajeroFrame cajeroFrame = new CajeroFrame();
        cajeroFrame.setVisible(true);
    });
}

public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        CajeroFrame cajeroFrame = new CajeroFrame();
        cajeroFrame.setVisible(true);
     });
    }
}
