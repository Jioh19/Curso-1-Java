package Fase2.main.fabrica;

import Fase2.main.clientes.ICategoria;
import Fase2.main.clientes.PersonaGold;
import Fase2.main.clientes.PersonaInicial;
import Fase2.main.clientes.PersonaSilver;

public abstract class FabricaPersona {
// Patron de diseño Fabrica abstracta
    public static ICategoria crearPersona(String rut, int puntaje) {
        ICategoria persona = null;

        if(puntaje <= 3000 && puntaje > 500) {
            return new PersonaInicial(rut);
        } else if(puntaje <= 6000 && puntaje > 3000) {
            return new PersonaSilver(rut);
        } else if(puntaje > 6000) {
            return new PersonaGold(rut);
        }

        return persona;
    }
}
