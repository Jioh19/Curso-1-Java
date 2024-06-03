package services;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.util.Optional;

public class LoginServiceSessionImpl implements LoginService{
    @Override
    public Optional<String> getUsername(HttpServletRequest request) {
        HttpSession session = request.getSession(); //crear la sesion
        String username = (String) session.getAttribute("username");
        if (username != null) //usuario creado
            {
            return Optional.of(username);
            }
        return Optional.empty(); //no iniciará una sesion el sistema
    }
}
