package cl.alke.pruebaDelicias.service;

public class StockNormal implements AlertaStock{
    @Override
    public void alertar() {
        System.out.println("Stock Normal");
    }
}
