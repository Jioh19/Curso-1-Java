package org.example.service;

import org.example.model.Cliente;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ServiceClienteTest {

    ServiceCliente serviceCliente = new ServiceCliente();
    //Map<Integer, Cliente> clientes = new HashMap<>();

    Cliente cliente = new Cliente("Juan", 123456, "pass");

    @Test
    public void crearCliente() {
        int inicio = serviceCliente.leerClientes().size();
        String resultado = serviceCliente.crearCliente(cliente);
        int fin = serviceCliente.leerClientes().size();
        assertEquals(inicio+1, fin);
        assertEquals(resultado, "Cliente creado");
    }

    @Test
    public void leerClientes() {
        var resultado = serviceCliente.leerClientes();
        assertNotNull(resultado);
    }

    @Test
    public void actualizarCliente() {
        int inicio = serviceCliente.leerClientes().size();
        String resultado = serviceCliente.actualizarCliente(cliente);
        int fin = serviceCliente.leerClientes().size();
        // assertEquals(inicio, fin);
        assertEquals(resultado, "Cliente actualizado");
    }

    @Test
    public void eliminarCliente() {
        String resultado = serviceCliente.eliminarCliente(null);
        assertEquals(resultado, "Eliminación fallida, verifique cliente");
    }
}