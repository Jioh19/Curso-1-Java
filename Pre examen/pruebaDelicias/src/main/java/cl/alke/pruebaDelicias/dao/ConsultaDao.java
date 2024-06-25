package cl.alke.pruebaDelicias.dao;

import cl.alke.pruebaDelicias.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ConsultaDao extends JpaRepository<Consulta, Integer> {

    @Query(value="SELECT s.nombre AS sucursal, p.idProducto AS id, p.nombreProducto AS producto, c.nombre AS categoria, st.stock\n" +
            "FROM SUCURSAL AS s\n" +
            "INNER JOIN stock AS st\n" +
            "on s.idSucursal = st.idSucursal\n" +
            "INNER JOIN PRODUCTO AS p\n" +
            "ON p.idProducto = st.idProducto\n" +
            "INNER JOIN CATEGORIA_PRODUCTO AS c\n" +
            "ON c.idCategoriaProducto = p.FK_idCategoriaProducto\n" +
            "WHERE s.nombre = :sucursal AND c.nombre = :categoria", nativeQuery = true)
    public List<Consulta> getConsulta(String sucursal, String categoria);
}
