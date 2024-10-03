package Vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasajeroFormulario {
    private JTextField apellidoTxt;
    private JTextField nombreTxt;
    private JTextField documentoTxt;
    private JTextField telefonoTxt;
    private JTextField correoTxt;
    private JButton eliminarButton;
    private JButton agregarButton;
    private JButton modificarButton;
    private JTable table1;
    private JFrame frame;

    // Declaración de las etiquetas
    private JLabel apellidoLbl;
    private JLabel nombreLbl;
    private JLabel documentoLbl;
    private JLabel telefonoLbl;
    private JLabel correoLbl;

    public PasajeroFormulario() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Formulario de Pasajero");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Panel para los campos de texto
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        // Inicializar etiquetas y campos de texto
        apellidoLbl = new JLabel("Apellido:");
        apellidoTxt = new JTextField();

        nombreLbl = new JLabel("Nombre:");
        nombreTxt = new JTextField();

        documentoLbl = new JLabel("Documento:");
        documentoTxt = new JTextField();

        telefonoLbl = new JLabel("Teléfono:");
        telefonoTxt = new JTextField();

        correoLbl = new JLabel("Correo:");
        correoTxt = new JTextField();

        // Añadir componentes al panel
        panel.add(apellidoLbl);
        panel.add(apellidoTxt);
        panel.add(nombreLbl);
        panel.add(nombreTxt);
        panel.add(documentoLbl);
        panel.add(documentoTxt);
        panel.add(telefonoLbl);
        panel.add(telefonoTxt);
        panel.add(correoLbl);
        panel.add(correoTxt);

        // Botones
        agregarButton = new JButton("Agregar");
        modificarButton = new JButton("Modificar");
        eliminarButton = new JButton("Eliminar");

        // Añadir acción a los botones
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarPasajero();
            }
        });

        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modificarPasajero();
            }
        });

        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarPasajero();
            }
        });

        // Panel para botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(agregarButton);
        buttonPanel.add(modificarButton);
        buttonPanel.add(eliminarButton);

        // Tabla
        table1 = new JTable(); // Puedes personalizar esta tabla según tus necesidades
        JScrollPane scrollPane = new JScrollPane(table1);

        // Añadir paneles al marco
        frame.add(panel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.add(scrollPane, BorderLayout.NORTH);

        // Hacer visible el marco
        frame.setVisible(true);
    }

    private void agregarPasajero() {
        // Lógica para agregar pasajero
        System.out.println("Agregar pasajero: " + nombreTxt.getText() + " " + apellidoTxt.getText());
    }

    private void modificarPasajero() {
        // Lógica para modificar pasajero
        System.out.println("Modificar pasajero: " + nombreTxt.getText() + " " + apellidoTxt.getText());
    }

    private void eliminarPasajero() {
        // Lógica para eliminar pasajero
        System.out.println("Eliminar pasajero: " + nombreTxt.getText() + " " + apellidoTxt.getText());
    }

    public static void main(String[] args) {
        new PasajeroFormulario();
    }
}
