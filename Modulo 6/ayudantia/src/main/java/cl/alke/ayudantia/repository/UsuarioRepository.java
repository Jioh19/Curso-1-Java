package cl.alke.ayudantia.repository;

import cl.alke.ayudantia.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByApellido(String Apellido);
}
