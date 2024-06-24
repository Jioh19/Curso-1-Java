package cl.alke.pruebaDelicias.niveles;

public class usuarioGold implements Nivel {
    @Override
    public String categoria() {
        return "Gold";
    }

    @Override
    public String beneficio() {
        return "·  \t1 regalo cada 2 compras.\n" +
                "·  \tPor cada $1000 de compra habrá un 15% de descuento.\n" +
                "·  \tRegalo especial 1 vez al mes.";
    }
}
