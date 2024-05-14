package org.example.service;

import org.example.model.Cliente;

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
//        if(clientes.get(cliente.getId()) == null) {
//            return "Cliente no existe, verifique";
//        }
        clientes.put(cliente.getId(), cliente);
        return "Cliente actualizado";
    }

    public String eliminarCliente(Cliente cliente) {
        if(cliente == null) {
            return "Eliminación fallida, verifique cliente";
        }
        clientes.remove(cliente.getId());
        return "Cliente eliminado";
    }
}
