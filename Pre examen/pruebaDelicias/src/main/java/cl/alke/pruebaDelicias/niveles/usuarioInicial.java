package cl.alke.pruebaDelicias.niveles;

public class usuarioInicial implements Nivel {


    @Override
    public String categoria() {
        return "Inicial";
    }

    @Override
    public String beneficio() {
        return "·  \t1 regalo cada 4 compras.\n" +
                "·  \tPor cada $1000 de compra habrá un 10% de descuento.";
    }
}
