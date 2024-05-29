package cl.alkemy.dao;

import java.sql.*;

public abstract class Dao {

    private Connection conn;
    protected ResultSet rs;
    private Statement stmt;

    protected void connectionDb() {
        try {
            String connectionString = "jdbc:mysql://localhost:3306/alkebanco";
            String user = "root";
            String password = "1160";
            conn = DriverManager.getConnection(connectionString, user, password);
            System.out.println("Conectado a la base datos");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    protected ResultSet consultar(String sql) {
        try {
            this.stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    protected int ejecutarSql(String sql) {
        try {
            this.stmt = conn.createStatement();
            return stmt.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    protected void close() {
        try {
            if(conn != null) {
                conn.close();
            }
            if(stmt != null) {
                stmt.close();
            }
            if(rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
