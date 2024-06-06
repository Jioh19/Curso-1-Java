package cl.alke.ayudantia.service;

import cl.alke.ayudantia.model.Usuario;
import cl.alke.ayudantia.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    public void delete(int id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario encontrarApellido(String apellido) {
        return usuarioRepository.findByApellido(apellido);
    }
}
