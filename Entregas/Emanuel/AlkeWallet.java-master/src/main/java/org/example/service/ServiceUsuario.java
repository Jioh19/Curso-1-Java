package org.example.service;

import org.example.model.Usuario;

import java.util.HashMap;
import java.util.Map;

public class ServiceUsuario {
    private static Map<String, Usuario> usuarios;

    public ServiceUsuario() {
        this.usuarios = new HashMap<>();
    }
    public static String crearUsuario(Usuario usuario)
    {
        if(usuario == null){
            return "El usuario no pude ser creado.";
        }
        usuarios.put(usuario.getRut(),usuario);
        return "El usuario fue creado correctamente.";
    }

    public Map<String, Usuario> leerUsuarios()
    {
        return this.usuarios;
    }

    public static String actualizarUsuario(Usuario usuario)
    {
        if(usuario == null){
            return "El usuario no pudo ser actualizado.";
        }

        usuarios.put(usuario.getRut(), usuario);
        return "El usuario fue actualizado correctamente.";
    }
    public String eliminarUsuario(Usuario usuario){
        if(usuario == null){
            return "El usuario no pude ser eliminado.";
        }
        usuarios.remove(usuario.getRut());
        return  "El usuario fue eliminado correctamente.";
    }
}
