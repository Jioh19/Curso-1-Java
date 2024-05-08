package org.example.service;

import org.example.model.Persona;

import java.util.HashMap;
import java.util.Map;

public class ServicioPersona {

    private Map<String, String> personasDb = new HashMap<>();
    public String crearPersona(Persona persona) {

        if(persona != null) {
            personasDb.put(persona.getRut(), persona.getNombre());

            return "Persona creada";
        } else {
            return "Persona no creada, verifique los datos";
        }
    }

    public String actualizarPersona(Persona persona) {
        if(persona == null) {
            return "Persona no actualizada, verifique los datos";
        }

        personasDb.put(persona.getRut(), persona.getNombre());
        return "Persona actualizada";
    }

    public Map<String, String> listarPersonas() {
        return personasDb;
    }

    public String eliminarPersona(Persona persona) {
        if(persona == null) {
            return "Persona no eliminada, verifique los datos";
        }

        personasDb.remove(persona);
        return "Persona eliminada";
    }
}
