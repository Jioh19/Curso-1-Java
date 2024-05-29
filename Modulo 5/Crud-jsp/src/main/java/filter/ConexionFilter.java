package filter;

import jakarta.servlet.*;
import util.ConexionDb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class ConexionFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        try (Connection connection = ConexionDb.getConnection()) {
            if(connection.getAutoCommit()) { //comprobar la conexion
                connection.setAutoCommit(false); //bajar la alerta
            }

            try {
                servletRequest.setAttribute("conexion", connection);
                filterChain.doFilter(servletRequest, servletResponse);
                connection.commit(); //confirmacion de lo anterior
            } catch (SQLException e) {
                connection.rollback();
            }


        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
