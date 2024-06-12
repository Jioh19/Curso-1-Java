package Fase2.main.clientes;

public class PersonaSilver extends Persona implements ICategoria{

    public PersonaSilver(String rut) {
        this.setRut(rut);
    }

    @Override
    public String getCategoria() {
        return "Silver";
    }

    @Override
    public String getBeneficios() {
        return "·  \t1 regalo cada 4 compras.\n" +
                "·  \tPor cada $1000 de compra habrá un 15% de descuento.";
    }

    @Override
    public boolean checkRut(String rut) {
        if(this.getRut().equals(rut)){
            return true;
        }
        return false;
    }
}
