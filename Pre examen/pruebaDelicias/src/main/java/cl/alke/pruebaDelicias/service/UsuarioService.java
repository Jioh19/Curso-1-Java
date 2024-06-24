package cl.alke.pruebaDelicias.service;

import cl.alke.pruebaDelicias.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.alke.pruebaDelicias.dao.UsuarioDao;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioDao dao;

    public int getPuntaje(String rut) {
        Optional<Usuario> usuario = dao.findById(rut);
        if(usuario.isEmpty()) {
            System.out.println("El usuario no existe");
            return 0;
        } else {
            return usuario.get().getPuntos();
        }
    }
}
