package Fase2.main.clientes;

public class PersonaInicial extends Persona implements ICategoria{

    public PersonaInicial(String rut) {
        this.setRut(rut);
    }

    @Override
    public String getCategoria() {
        return "Inicial";
    }

    @Override
    public String getBeneficios() {
        return "·  \t1 regalo cada 4 compras.\n" +
                "·  \tPor cada $1000 de compra habrá un 10% de descuento.";
    }

    @Override
    public boolean checkRut(String rut) {
        if(this.getRut().equals(rut)){
            return true;
        }
        return false;
    }
}
