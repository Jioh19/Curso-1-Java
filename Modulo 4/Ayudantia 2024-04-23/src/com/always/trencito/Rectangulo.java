package com.always.trencito;

public class Rectangulo implements Figura{
    private double base;
    private double altura;

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double getArea() {
        return base*altura;
    }
}
