package util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {

    static int puerto = 3306;
    static String nombreBd = "java_curso";
    //locahost equivale 127.0.0.1
    private final static String URL =
            "jdbc:mysql://localhost:"+puerto+"/"+nombreBd;
    //localhost:8889/tiendaE
    private static String usuario="root"; //bd usuario
    private static String pass = "1160"; //pass usuario bd

    private static BasicDataSource pool;
    /*pool: es un objeto que almacenará todos las configuraciones
     para conectar a la base de datos

     */

    //metodos

    public static BasicDataSource obtenerPool() throws SQLException
    {
        if(pool==null)
        {
            pool= new BasicDataSource(); //creando un objeto
            pool.setUrl(URL); //envia URL como ruta de acceso
            pool.setUsername(usuario); //enviar usuario de la BD
            pool.setPassword(pass);//enviar password usuario BD
            pool.setInitialSize(3); //valor de los parámetros iniciales que recibirá
            pool.setMinIdle(3); // establece tiempo minimo de 3 segundos de espera
            pool.setMaxIdle(10);// establece tiempo maximo de 10 segundos de espera


        }
        return pool;

    }

    public static Connection getConnection() throws SQLException {
        return obtenerPool().getConnection(); //retornar una conexion
    }

}
