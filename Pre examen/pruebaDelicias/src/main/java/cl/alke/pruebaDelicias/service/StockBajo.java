package cl.alke.pruebaDelicias.service;

public class StockBajo implements AlertaStock{
    @Override
    public void alertar() {
        System.out.println("Alerta Stock Bajo!");
    }
}
