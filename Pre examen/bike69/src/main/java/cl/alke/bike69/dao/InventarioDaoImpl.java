package cl.alke.bike69.dao;

import cl.alke.bike69.model.Inventario;
import java.sql.ResultSet;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InventarioDaoImpl implements InventarioDao{

    private final JdbcTemplate jdbcTemplate;

    public InventarioDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Inventario> findAll(String tienda, String categoria, String marca) {

        String sql = String.format("SELECT s.store_name, p.product_id, p.product_name, st.quantity\n" +
                "FROM stores AS s\n" +
                "INNER JOIN stocks as st\n" +
                "ON s.store_id = st.store_id\n" +
                "INNER JOIN products as p\n" +
                "ON p.product_id = st.product_id\n" +
                "INNER JOIN categories as c\n" +
                "ON p.category_id = c.category_id\n" +
                "INNER JOIN brands as b\n" +
                "ON b.brand_id = p.brand_id\n" +
                "WHERE s.store_name='%s' AND b.brand_name ='%s' AND c.category_name = '%s'",
                tienda, marca, categoria);

        List<Inventario> resultado = jdbcTemplate.query(sql,
                (ResultSet rs, int rowNum) -> {
                    Inventario inventario = new Inventario();
                    inventario.setQuantity(rs.getInt("quantity"));
                    inventario.setProduct_id(rs.getInt("product_id"));
                    inventario.setProduct_name(rs.getString("product_name"));
                    inventario.setStore_name(rs.getString("store_name"));
                    return inventario;
                });
        return resultado;
    }
}
