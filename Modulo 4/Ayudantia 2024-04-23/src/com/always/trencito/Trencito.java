package com.always.trencito;

public class Trencito {
    public static void main(String[] args) {
        Figura cuad1 = new Cuadrado(1);
        Figura cuad2 = new Cuadrado(2);
        Figura rect = new Rectangulo(2, 5);
        Figura tri = new Triangulo(2,2);
        Figura circ = new Circulo(1);

        FiguraComposite tren = new FiguraComposite();
        tren.agregarFigura(cuad1);
        tren.agregarFigura(cuad2);
        tren.agregarFigura(rect);
        tren.agregarFigura(tri);
        tren.agregarFigura(circ);
        tren.agregarFigura(circ);
        tren.agregarFigura(circ);

        System.out.println("El area total del trencito es " + tren.getArea());
    }
}
