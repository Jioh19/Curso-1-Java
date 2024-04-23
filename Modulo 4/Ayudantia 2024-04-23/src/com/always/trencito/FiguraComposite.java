package com.always.trencito;

import java.util.ArrayList;

public class FiguraComposite implements Figura{

    ArrayList<Figura> figuras;

    public FiguraComposite() {
        figuras = new ArrayList<Figura>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    @Override
    public double getArea() {
        double acum = 0;

//        for(int i = 0; i < figuras.size(); i++) {
//            acum += figuras.get(i).getArea(); //figuras[i].getArea()
//        }

        for(Figura figura : figuras) {
            acum += figura.getArea();
        }

        return acum;
    }
}
