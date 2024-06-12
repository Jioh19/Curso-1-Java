package Fase2.main.clientes;

public class PersonaGold extends Persona implements ICategoria{

    public PersonaGold(String rut) {
        this.setRut(rut);
    }

    @Override
    public String getCategoria() {
        return "Gold";
    }

    @Override
    public String getBeneficios() {
        return "·  \t1 regalo cada 2 compras.\n" +
                "·  \tPor cada $1000 de compra habrá un 15% de descuento.\n" +
                "·  \tRegalo especial 1 vez al mes.";
    }

    @Override
    public boolean checkRut(String rut) {
        if(this.getRut().equals(rut)){
            return true;
        }
        return false;
    }
}
