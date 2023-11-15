/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sefue
 */
public class empleados {
    

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GestionEmpleados extends JFrame implements ActionListener {
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private JTextField nombreField, fechaField;
    private JTextArea outputArea;

    public GestionEmpleados() {
        setTitle("Gestión de Empleados");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(30, 30, 80, 25);
        add(nombreLabel);

        nombreField = new JTextField();
        nombreField.setBounds(120, 30, 200, 25);
        add(nombreField);

        JLabel fechaLabel = new JLabel("Fecha de Contrato:");
        fechaLabel.setBounds(30, 60, 120, 25);
        add(fechaLabel);

        fechaField = new JTextField();
        fechaField.setBounds(160, 60, 160, 25);
        add(fechaField);

        JButton addButton = new JButton("Crear Empleado");
        addButton.setBounds(30, 100, 150, 25);
        addButton.addActionListener(this);
        add(addButton);

        JButton showAllButton = new JButton("Mostrar Todos");
        showAllButton.setBounds(200, 100, 150, 25);
        showAllButton.addActionListener(this);
        add(showAllButton);

        outputArea = new JTextArea();
        outputArea.setBounds(30, 140, 320, 100);
        add(outputArea);
    }

    public static void main(String[] args) {
        GestionEmpleados gui = new GestionEmpleados();
        gui.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Crear Empleado")) {
            String nombre = nombreField.getText();
            String fecha = fechaField.getText();
            Empleado empleado = new Empleado(nombre, fecha);
            empleados.add(empleado);
            mostrarEmpleados();
        } else if (e.getActionCommand().equals("Mostrar Todos")) {
            mostrarEmpleados();
        }
    }

    private void mostrarEmpleados() {
        outputArea.setText("");
        for (Empleado emp : empleados) {
            outputArea.append("Nombre: " + emp.getNombre() + " Fecha: " + emp.getFecha() + "\n");
        }
    }
}

class Empleado {
    private String nombre;
    private String fecha;

    public Empleado(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }
}
}
