package com.alke.service;

import com.alke.dao.UsuarioRepositorio;
import com.alke.model.Usuario;

import java.sql.SQLException;
import java.util.List;

public class UsuarioService {
    private UsuarioRepositorio repositorio = new UsuarioRepositorio();

    public void registrarUsuario(Usuario usuario) {
        try {
            repositorio.crear(usuario);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Usuario> obtenerUsuarios() {
        try {
            return repositorio.leer();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
