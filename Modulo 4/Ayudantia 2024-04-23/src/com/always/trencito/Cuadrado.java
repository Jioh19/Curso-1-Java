package com.always.trencito;

public class Cuadrado implements Figura{

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado*lado;
    }
}
