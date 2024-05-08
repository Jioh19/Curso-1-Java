package org.example.main.service;

import org.example.main.model.Cliente;

import java.util.HashMap;
import java.util.Map;

public class ServiceCliente {

    private Map<Integer, Cliente> clientes;

    public ServiceCliente() {
        this.clientes = new HashMap<Integer, Cliente>();
    }

    public String crearCliente(Cliente cliente) {
        if(cliente == null) {
            return "Creación fallida, verifique cliente";
        }
        clientes.put(cliente.getId(), cliente);
        return "Cliente creado";
    }

    public Map<Integer, Cliente> leerClientes() {
        return this.clientes;
    }

    public String actualizarCliente(Cliente cliente) {
        if(cliente == null) {
            return "Actualización fallida, verifique cliente";
        }
        clientes.put(cliente.getId(), cliente);
        return "Cliente actualizado";
    }

    public String eliminarClinete(Cliente cliente) {
        if(cliente == null) {
            return "Eliminación fallida, verifique cliente";
        }
        clientes.remove(cliente.getId());
        return "Cliente eliminado";
    }
}
