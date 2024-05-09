package org.example.repositorio;

import org.example.modelo.Persona;

import java.util.HashMap;
import java.util.Map;

public class RepositorioPersona {


    private Map<String, String> personasDb = new HashMap<>();

    public boolean crearPersona(Persona persona) {

        if (persona != null) {
            personasDb.put(persona.getRut(), persona.getNombre());

            return true;
        } else {
            return false;
        }
    }

    public boolean actualizarPersona(Persona persona) {
        if (persona == null) {
            return false;
        }

        personasDb.put(persona.getRut(), persona.getNombre());
        return true;
    }

    public Map<String, String> listarPersonas() {
        return personasDb;
    }

    public boolean eliminarPersona(Persona persona) {
        if (persona == null) {
            return false;
        }

        personasDb.remove(persona);
        return true;
    }


}
