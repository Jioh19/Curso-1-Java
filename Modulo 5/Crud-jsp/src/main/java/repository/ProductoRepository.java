package repository;

import model.Category;
import model.Producto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepository implements Repository<Producto>{

    private Connection connection;

    public ProductoRepository(Connection connection) {
        this.connection = connection;

    }

    private Producto getProducto(ResultSet resultSet) throws SQLException{
        Producto producto = new Producto();
        producto.setId(resultSet.getLong("id"));
        producto.setSku(resultSet.getString("nombre"));
        producto.setPrecio(resultSet.getInt("precio"));
        producto.setSku(resultSet.getString("sku"));
        producto.setFechaRegistro(resultSet.getDate("fecha_registro").toLocalDate());
        Category categoria = new Category();
        categoria.setId(resultSet.getLong("categoria_id"));
        categoria.setNombre(resultSet.getString("categoria"));
        producto.setCategoria(categoria);

        return producto;

    }

    @Override
    public List<Producto> listar() throws SQLException {
        List<Producto> productos = new ArrayList<>();
        try ( Statement statement = connection.createStatement();
              ResultSet resultSet =statement.executeQuery(
                      "SELECT p.*, c.nombre as categoria\n" +
                              "from productos as p inner join categorias as c \n" +
                              "on c.id=p.categoria_id");) {
            while(resultSet.next()) {
                Producto p = getProducto(resultSet);
                productos.add(p);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productos;
    }

    @Override
    public Producto porId(Long id) throws SQLException {
        return null;
    }

    @Override
    public void guardar(Producto producto) throws SQLException {

    }

    @Override
    public void eliminar(Long id) throws SQLException {

    }
}
