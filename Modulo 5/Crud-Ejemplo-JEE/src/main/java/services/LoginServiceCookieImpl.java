package services;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;

import java.util.Arrays;
import java.util.Optional;

public class LoginServiceCookieImpl implements LoginService {
    @Override
    public Optional<String> getUsername(HttpServletRequest req) {
        Cookie[] cookies = req.getCookies() != null ? req.getCookies(): new Cookie[0];
        /*
           if(req.getCookies!=null)
           {
           req.getCookies();
           }

           else

           {
           new Cookie[0];
           }


         */

        //Streams: flujos de datos para mandar cadenas 0's y 1's
        return Arrays.stream(cookies)
                .filter(c-> "username".equals(c.getName()))
                .map(Cookie::getValue)
                .findAny();
        //map: retornar el conjunto de cookies
        //findAny(): mostrar el map con el tipo de dato  del retorno
        // me va retornar el valor como Optional: puede ser nulo
        //p: Si estudio entonces q: me irá super bien
        //p->q  p: predicado q: consecuencia
    }
}
