package cl.alke.pruebaDelicias.service;

import cl.alke.pruebaDelicias.dao.ConsultaDao;
import cl.alke.pruebaDelicias.model.Consulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {

    @Autowired
    ConsultaDao dao;

    public List<Consulta> getConsulta(String sucursal, String categoria) {
        return dao.getConsulta(sucursal, categoria);
    }
}
