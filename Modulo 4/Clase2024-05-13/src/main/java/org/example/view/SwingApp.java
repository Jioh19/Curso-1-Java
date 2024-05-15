package org.example.view;

import org.example.model.Empleado;
import org.example.repository.Repositorio;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.List;

public class SwingApp extends JFrame {

    //private final Repositorio<Empleado> empleadoRepositorio;

    private final JTable tablaEmpleado;

    public SwingApp() {

        setTitle("Administrador de Empleados");
        setSize(640, 480);

        tablaEmpleado = new JTable();
        JScrollPane scrollPane = new JScrollPane(tablaEmpleado);
        add(scrollPane, BorderLayout.CENTER);

        JButton agregarButton = new JButton("Agregar");
        JButton actualizarButton = new JButton("Actualizar");
        JButton eliminarButton = new JButton("Eliminar");
        JPanel panelButton = new JPanel();
        panelButton.add(agregarButton);
        panelButton.add(actualizarButton);
        panelButton.add(eliminarButton);
        add(panelButton, BorderLayout.SOUTH);
    }
}
