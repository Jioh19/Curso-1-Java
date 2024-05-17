package org.example.view;

import org.example.model.Empleado;
import org.example.repository.EmpleadoRepositorio;
import org.example.repository.Repositorio;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException;
import java.util.List;

public class SwingApp extends JFrame {

    private final Repositorio<Empleado> empleadoRepositorio;

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

        agregarButton.setBackground(new Color(48, 213, 110));
        agregarButton.setForeground(new Color(255, 255, 255));

        empleadoRepositorio = new EmpleadoRepositorio();
        refrescarTablaEmpleado();
        agregarButton.addActionListener(e -> {
            try {
                agregarEmpleado();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });
        actualizarButton.addActionListener(e -> actualizarEmpleado());
        eliminarButton.addActionListener(e -> eliminarEmpleado());

    }

    private void eliminarEmpleado() {
        String empleadoIdStr = JOptionPane.showInputDialog(
                this, "Ingrese el ID del empleado a eliminar",
                "Eliminar empleado", JOptionPane.QUESTION_MESSAGE);
        if (empleadoIdStr != null) {

            try {
                int empleadoId = Integer.parseInt(empleadoIdStr);
                int confirmarEliminacion = JOptionPane.showConfirmDialog(
                        this, "Seguro desea eliminar empleado?", "Confirmar eliminacion", JOptionPane.YES_NO_OPTION);
                if (confirmarEliminacion == JOptionPane.YES_OPTION) {
                    empleadoRepositorio.eliminar(empleadoId);
                    refrescarTablaEmpleado();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Id no válido ",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al obtener los datos ",
                        "Error SQL", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void actualizarEmpleado() {
        String empleadoIdStr = JOptionPane.showInputDialog(
                this, "Ingrese el ID del empleado a actualizar",
                "Actualizar empleado", JOptionPane.QUESTION_MESSAGE);
        if (empleadoIdStr != null) {
            try {
                int empleadoId = Integer.parseInt(empleadoIdStr);
                Empleado empleado = empleadoRepositorio.obtenerPorId(empleadoId);
                if (empleado != null) {
                    JTextField nombre = new JTextField();
                    JTextField primerApellido = new JTextField();
                    JTextField segundoApellido = new JTextField();
                    JTextField email = new JTextField();
                    JTextField salario = new JTextField();
                    Object[] campos = {
                            "Nombre: ", nombre,
                            "Primer Apellido: ", primerApellido,
                            "Segundo Apellido: ", segundoApellido,
                            "Email: ", email,
                            "Salario: ", salario,
                    };

                    int confirmarResultado = JOptionPane.showConfirmDialog(
                            this, campos, "Actualizar empleado", JOptionPane.OK_CANCEL_OPTION);
                    if (confirmarResultado == JOptionPane.OK_OPTION) {
                        empleado.setNombre(nombre.getText());
                        empleado.setPrimerApellido(primerApellido.getText());
                        empleado.setSegundoApellido(segundoApellido.getText());
                        empleado.setEmail(email.getText());
                        empleado.setSalario(Float.parseFloat(salario.getText()));
                        empleadoRepositorio.guardar(empleado);
                        refrescarTablaEmpleado();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Id no válido ",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Id no válido ",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al obtener los datos ",
                        "Error SQL", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void agregarEmpleado() throws SQLException {

        JTextField nombre = new JTextField();
        JTextField primerApellido = new JTextField();
        JTextField segundoApellido = new JTextField();
        JTextField email = new JTextField();
        JTextField salario = new JTextField();
        Object[] campos = {
                "Nombre: ", nombre,
                "Primer Apellido: ", primerApellido,
                "Segundo Apellido: ", segundoApellido,
                "Email: ", email,
                "Salario: ", salario,
        };

        int resultado = JOptionPane.showConfirmDialog(
                this, campos, "Agregar empleado", JOptionPane.OK_CANCEL_OPTION);

        if (resultado == JOptionPane.OK_OPTION) {

            Empleado empleado = new Empleado();

            empleado.setNombre(nombre.getText());
            empleado.setPrimerApellido(primerApellido.getText());
            empleado.setSegundoApellido(segundoApellido.getText());
            empleado.setEmail(email.getText());
            empleado.setSalario(Float.parseFloat(salario.getText()));

            empleadoRepositorio.guardar(empleado);

            refrescarTablaEmpleado();
            JOptionPane.showMessageDialog(
                    this, "Empleado agregado exitosamente",
                    "Operacion exitosa", JOptionPane.INFORMATION_MESSAGE);
        }


    }

    private void refrescarTablaEmpleado() {

        try {
            List<Empleado> empleados = empleadoRepositorio.encontrarTodo();
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("id");
            model.addColumn("nombre");
            model.addColumn("primerApellido");
            model.addColumn("segundoApellido");
            model.addColumn("email");
            model.addColumn("salario");
            for (Empleado empleado : empleados) {

                Object[] filaDatos = {
                        empleado.getId(),
                        empleado.getNombre(),
                        empleado.getPrimerApellido(),
                        empleado.getSegundoApellido(),
                        empleado.getEmail(),
                        empleado.getSalario(),

                };
                model.addRow(filaDatos);
            }
            tablaEmpleado.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,
                    e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
