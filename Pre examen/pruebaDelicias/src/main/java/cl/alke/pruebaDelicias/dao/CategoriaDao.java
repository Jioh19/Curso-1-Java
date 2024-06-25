package cl.alke.pruebaDelicias.dao;

import cl.alke.pruebaDelicias.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Integer> {
}
