package listener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

//Permite crear una sesión de usuario
@WebListener
public class ApplicationListener implements
        ServletContextListener, ServletRequestListener, HttpSessionListener {

    private ServletContext servletContext;

    //ContextInitialized inicializa una sesión
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        sce.getServletContext().log("Iniciando la aplicación");
        servletContext = sce.getServletContext();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        servletContext.log("Destruyendo la aplicación");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        servletContext.log("Iniciando el request");
        sre.getServletRequest().setAttribute("mensaje", "valor");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        servletContext.log("Fue destruido el requerimiento/request");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        servletContext.log("Inicializando sesion HTTP");
        HttpSession session = se.getSession();
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        servletContext.log("Destruyendo la sesion");
    }
}
