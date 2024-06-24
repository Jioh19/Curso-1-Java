package cl.alke.pruebaDelicias.dao;

import cl.alke.pruebaDelicias.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, String> {
}
