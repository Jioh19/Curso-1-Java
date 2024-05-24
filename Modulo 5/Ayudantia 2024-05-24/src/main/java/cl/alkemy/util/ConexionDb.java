package cl.alkemy.util;

import org.apache.commons.dbcp2.BasicDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConexionDb {

    static int port = 3306;

    static String nombreDb = "alkebanco";
    private static final String URL =
            "jdbc:mysql://localhost:" + port + "/" + nombreDb;
    private static String usuario = "root";
    private static String pass = "1160";
    private static BasicDataSource pool;

    public static BasicDataSource getPool() throws SQLException {
        if(pool == null) {
            pool = new BasicDataSource();
            pool.setUrl(URL);
            pool.setUsername(usuario);
            pool.setPassword(pass);
            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(10);
        }
        return pool;
    }

    public static Connection getConection() throws SQLException {
        return getPool().getConnection();
    }

//    public static void main(String[] args) throws SQLException {
//        Connection pool = getConection();
//        if(pool == null) {
//            System.out.println("Conexion fallida");
//        } else{
//            System.out.println("Conexion exitosa");
//        }
//    }
}
