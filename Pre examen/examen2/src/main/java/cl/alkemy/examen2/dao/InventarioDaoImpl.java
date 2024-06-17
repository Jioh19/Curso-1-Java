package cl.alkemy.examen2.dao;

import cl.alkemy.examen2.model.Inventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InventarioDaoImpl implements InventarioDao {

    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public List<Inventario> findAll(String tienda, String categoria, String marca) {

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("tienda", tienda);
        params.put("categoria", categoria);
        params.put("marca", marca);

        String sql = "SELECT s.store_name, p.product_id, p.product_name, st.quantity, c.category_name, b.brand_name\n" +
                "FROM stores AS s\n" +
                "INNER JOIN stocks AS st\n" +
                "ON st.store_id = s.store_id\n" +
                "INNER JOIN products AS p\n" +
                "ON st.product_id = p.product_id\n" +
                "INNER JOIN categories AS c\n" +
                "ON c.category_id = p.category_id\n" +
                "INNER JOIN brands AS b\n" +
                "ON b.brand_id = p.brand_id\n" +
                "WHERE c.category_name=:categoria AND b.brand_name=:marca AND s.store_name=:tienda";


        List<Inventario> resultado = namedParameterJdbcTemplate.query(sql, params, new InventarioMapper());
        System.out.println(resultado);
        return resultado;
    }

    private static final class InventarioMapper implements RowMapper<Inventario> {

        public Inventario mapRow(ResultSet rs, int rowNum) throws SQLException {
            Inventario inventario = new Inventario();
            inventario.setInventario(rs.getInt("quantity"));
            inventario.setIdProducto(rs.getInt("product_id"));
            inventario.setTienda(rs.getString("store_name"));
            inventario.setNombreProducto(rs.getString("product_name"));
            return inventario;
        }
    }
}
