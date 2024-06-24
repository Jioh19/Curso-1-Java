package cl.alke.pruebaDelicias.niveles;

public class usuarioSilver implements Nivel {
    @Override
    public String categoria() {
        return "Silver";
    }

    @Override
    public String beneficio() {
        return "·  \t1 regalo cada 4 compras.\n" +
                "·  \tPor cada $1000 de compra habrá un 15% de descuento.";
    }
}
